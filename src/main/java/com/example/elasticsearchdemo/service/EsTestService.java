package com.example.elasticsearchdemo.service;

/**
 * @author tianzh
 * @date 2021/07/29
 */
public interface EsTestService {

    /**
     * 测试 index API
     */
    void testEsRestIndexApi();
    void testEsRestDeleteApi();
    void testEsRestUpdateApi();
    void testEsRestSelectApi();

    void testEsMSearch();

    void testEsRestCreateIndexApi();
}
