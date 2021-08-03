package com.example.elasticsearchdemo.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 用于动态配置Es中的indexName
 *
 * @author tianzh
 * @date 2021/08/03
 */
@Component
@Data
public class EsIndexNameConfig {
    @Value("${elasticsearch.indexName.esPerson}")
    private String esPerson;

    @Value("${elasticsearch.indexName.seBd}")
    private String seBd;
}
