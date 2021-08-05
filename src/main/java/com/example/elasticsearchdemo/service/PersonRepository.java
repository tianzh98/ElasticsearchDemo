package com.example.elasticsearchdemo.service;

import com.example.elasticsearchdemo.pojo.Person;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * 创建此ElasticsearchRepository，springboot启动时根据@Document注解去自动创建对应的index
 * 这个先弃用，目前还是RestHighLevelClient是官方推荐的
 *
 * @author tianzh
 * @date 2021/08/02
 */
public interface PersonRepository
//        extends ElasticsearchRepository<Person,String>
{

}
