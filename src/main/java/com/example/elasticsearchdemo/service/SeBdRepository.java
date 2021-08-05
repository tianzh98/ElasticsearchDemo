package com.example.elasticsearchdemo.service;

import com.example.elasticsearchdemo.pojo.SeBd;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * 扩展接口 ElasticsearchRepository 则会根据注解自动生成index
 *  * 这个先弃用，目前还是RestHighLevelClient是官方推荐的
 *
 * @author tianzh
 * @date 2021/08/03
 */
public interface SeBdRepository
//        extends ElasticsearchRepository<SeBd,String>
{

}
