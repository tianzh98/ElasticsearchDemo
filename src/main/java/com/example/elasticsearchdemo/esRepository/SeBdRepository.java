package com.example.elasticsearchdemo.esRepository;

import com.example.elasticsearchdemo.pojo.SeBd;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author tianzh
 * @date 2021/08/03
 */
public interface SeBdRepository extends ElasticsearchRepository<SeBd,String> {
}
