package com.example.elasticsearchdemo.config;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;

/**
 * Using the RestClient
 *
 * @author tianzh
 * @date 2021/07/29
 */
@Configuration
public class RestClientConfig extends AbstractElasticsearchConfiguration {

    @Value("${elasticsearch.hostAndPorts}")
    private String[] hostAndPorts;

    @Override
    @Bean(destroyMethod="close")
    public RestHighLevelClient elasticsearchClient() {
        final ClientConfiguration clientConfiguration = ClientConfiguration.builder()
                .connectedTo(hostAndPorts)
                .build();
        return RestClients.create(clientConfiguration).rest();
    }
}