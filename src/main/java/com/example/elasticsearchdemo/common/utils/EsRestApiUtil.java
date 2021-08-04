package com.example.elasticsearchdemo.common.utils;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;
import com.example.elasticsearchdemo.common.enums.ENEsIndex;
import com.example.elasticsearchdemo.pojo.EsBasePO;
import com.example.elasticsearchdemo.pojo.SeBd;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.common.unit.Fuzziness;
import org.elasticsearch.common.unit.TimeValue;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;

import java.util.concurrent.TimeUnit;

/**
 * 根据业务需求，封装一些ElasticSearch查询参数
 *
 * @author tianzh
 * @date 2021年08月01日
 */
public class EsRestApiUtil {

    /**
     * 对生成RestHighLevelClient的index方法需要的IndexRequest参数
     *
     * @param document 文档
     * @param indexName 可以在此方法单独设置indexName(优先获取此参数值)，如果此参数为空，则会去document获取indexName，否则抛异常
     * @param <T>      Document必须扩展了EsBasePO
     * @return 返回
     */
    public static <T extends EsBasePO> IndexRequest createIndexRequest(T document, String indexName) {
        IndexRequest indexRequest;
        if (StrUtil.isNotEmpty(indexName)) {
            indexRequest = new IndexRequest(indexName);
        } else if (StrUtil.isNotEmpty(document.getIndexName())) {
            indexRequest = new IndexRequest(document.getIndexName());
        } else {
            throw new RuntimeException("indexName缺失");
        }
        // 唯一id会在EsBasePO构造函数执行时自动生成
//        indexRequest.id(document.getEsId());
        indexRequest.source(JSONUtil.parseObj(document), XContentType.JSON);
        return indexRequest;
    }
    public static IndexRequest createSeBdIndexRequest(SeBd document, String indexName) {
        IndexRequest indexRequest;
        if (StrUtil.isNotEmpty(indexName)) {
            indexRequest = new IndexRequest(indexName);
        } else if (StrUtil.isNotEmpty(document.getIndexName())) {
            indexRequest = new IndexRequest(document.getIndexName());
        } else {
            throw new RuntimeException("indexName缺失");
        }
        // 唯一id会在EsBasePO构造函数执行时自动生成
        indexRequest.id(document.getUrid().toString());
        indexRequest.source(JSONUtil.parseObj(document), XContentType.JSON);
        return indexRequest;
    }

    public static SearchRequest createFuzzinessSearchRequest(String name, Object text, String... indices) {
        // 查询对象
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        //查询包含关键词字段的文档
        // todo 注意 这里对于 数字类型的值 是会查询报错的，支持的类型只能是text, 解决方啊参见termQuery
        QueryBuilder matchQueryBuilder = QueryBuilders.matchQuery(name, text)
                // 启动模糊查询
                .fuzziness(Fuzziness.AUTO)
                // 在匹配查询上设置前缀长度选项
                .prefixLength(3)
                // 设置最大扩展选项以控制查询的模糊过程
                .maxExpansions(10);

        searchSourceBuilder.query(matchQueryBuilder);
        // 置查询的起始索引位置和数量
        searchSourceBuilder.from(0);
        searchSourceBuilder.size(50);
        // 60秒超时返回
        searchSourceBuilder.timeout(new TimeValue(60, TimeUnit.SECONDS));

        // 请求对象
        // 查询条件需要设置进去
        SearchRequest searchRequest = new SearchRequest(indices);
        searchRequest.source(searchSourceBuilder);
        return searchRequest;
    }

//    public static QueryBuilder createQueryBuilder() {
//
//    }
}
