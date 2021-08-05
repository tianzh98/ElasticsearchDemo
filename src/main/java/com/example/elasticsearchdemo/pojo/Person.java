package com.example.elasticsearchdemo.pojo;

import com.example.elasticsearchdemo.common.enums.ENEsIndex;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

/**
 * Spel语法动态设置indexName
 * @author tianzh
 * @date 2021/07/29
 */
@Data
//@Document(indexName = "#{@esIndexNameConfig.esPerson}")
public class Person extends EsBasePO implements Serializable {
    private static final long serialVersionUID = 1828760928850240542L;

//    @Id
    private String id;
//    @Field(type = FieldType.Keyword)
    private String name;
    /**
     * 字段的长度越短，索引和搜索的效率越高,对于年龄 short足以
     */
//    @Field(type = FieldType.Short)
    private Integer age;
//    @Field(type = FieldType.Text)
    private String gender;
}
