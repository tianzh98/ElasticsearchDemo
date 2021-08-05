package com.example.elasticsearchdemo;

import com.example.elasticsearchdemo.service.EsTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.PostConstruct;

@SpringBootApplication
@EnableTransactionManagement
public class ElasticsearchDemoApplication {

    @Autowired
    EsTestService esTestService;
    public static void main(String[] args) {
        SpringApplication.run(ElasticsearchDemoApplication.class, args);
    }


    @PostConstruct
    private void myTest() {
        // TODO 同时执行插入和查询/删除 时，本次插入的数据不会被查询/删除掉  有延迟
//            esTestService.testEsRestIndexApi();
//            esTestService.testEsRestSelectApi();
//            esTestService.testEsRestDeleteApi();

//        esTestService.testEsRestUpdateApi();
//        esTestService.testEsMSearch();
//        esTestService.testBoolQuery();

//        esTestService.insertSebdToEs();
    }

}
