package com.example.elasticsearchdemo.config;

import lombok.extern.slf4j.Slf4j;
import org.elasticsearch.action.support.master.AcknowledgedResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.client.indices.CreateIndexResponse;
import org.elasticsearch.client.indices.GetIndexRequest;
import org.elasticsearch.client.indices.PutMappingRequest;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author tianzh
 * @date 2021/08/04
 */
@Slf4j
@Component
public class EsIndexCreator {
    @Autowired
    private RestHighLevelClient highLevelClient;
    @Autowired
    private EsIndexNameConfig esIndexNameConfig;

    @PostConstruct
    private void createIndexSeBdWithMapping() {
        try {
            String indexName = esIndexNameConfig.getSeBd();
            // 分片数
            int shards = 3;
            // 副本数(集群节点个数-1 即占满所有节点)
            int replicas = 2;
            final GetIndexRequest request = new GetIndexRequest(indexName);
            final boolean exists = highLevelClient.indices().exists(request, RequestOptions.DEFAULT);
            if (!exists) {
                log.info("index:{},不存在，正在创建", esIndexNameConfig.getSeBd());
                final CreateIndexRequest indexRequest = new CreateIndexRequest(indexName);
                indexRequest.settings(Settings.builder()
                        .put("index.number_of_shards", shards)
                        .put("index.number_of_replicas", replicas)
                );
                final CreateIndexResponse createIndexResponse = highLevelClient.indices().create(indexRequest, RequestOptions.DEFAULT);
                if (createIndexResponse.isAcknowledged() && createIndexResponse.isShardsAcknowledged()) {
                    log.info("索引{}创建成功 ", indexName);
                } else {
                    log.debug("创建索引{}失败", indexName);
                }

                final PutMappingRequest mappingRequest = new PutMappingRequest(indexName);
                final XContentBuilder builder = XContentFactory.jsonBuilder();

                builder.startObject();
                {
                    builder.startObject("properties");
                    {
                        builder.startObject("urid");
                        {
                            builder.field("type", "keyword");
                        }
                        builder.endObject();

                        builder.startObject("entNum");
                        {
                            builder.field("type", "keyword");
                        }
                        builder.endObject();

                        builder.startObject("batNo");
                        {
                            builder.field("type", "keyword");
                        }
                        builder.endObject();

                        builder.startObject("bdNo");
                        {
                            builder.field("type", "keyword");
                        }
                        builder.endObject();

                        builder.startObject("flowNo");
                        {
                            builder.field("type", "keyword");
                        }
                        builder.endObject();
                    }
                    builder.endObject();
                }
                builder.endObject();
                mappingRequest.source(builder);
                final AcknowledgedResponse putMappingResponse = highLevelClient.indices().putMapping(mappingRequest, RequestOptions.DEFAULT);

                if (putMappingResponse.isAcknowledged()) {
                    log.info("索引{}的mapping:{}创建成功", indexName, builder);
                } else {
                    log.debug("索引{}的mapping:{}创建失败", indexName, builder);
                }
            } else {
                log.info("index:{},已经存在", esIndexNameConfig.getSeBd());
            }
        } catch (Exception ex) {
            log.error("创建索引时异常", ex);
        }
    }
}
