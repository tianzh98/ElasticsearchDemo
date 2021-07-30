package com.example.elasticsearchdemo.service.impl;

import cn.hutool.json.JSONUtil;
import com.example.elasticsearchdemo.pojo.Person;
import com.example.elasticsearchdemo.service.EsTestService;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * 使用ES 的rest API 的测试service
 *
 * @author tianzh
 * @date 2021/07/29
 */
@Service
public class EsTestServiceImpl implements EsTestService {
    @Autowired
    RestHighLevelClient highLevelClient;

    @Override
    public void testEsRestApi() {
        try {
            highLevelClient.c
            IndexRequest indexRequest = new IndexRequest();
            Person person = new Person();
            person.setName("田梓豪");
            person.setAge(22);
            person.setGender("男");
            indexRequest.source(JSONUtil.toJsonStr(person), XContentType.JSON);
            highLevelClient.index(indexRequest, RequestOptions.DEFAULT);
            highLevelClient.get(new GetRequest().)
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
