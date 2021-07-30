package com.example.elasticsearchdemo.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author tianzh
 * @date 2021/07/29
 */
@Data
public class Person implements Serializable {
    private static final long serialVersionUID = 1828760928850240542L;

    private String name;
    private Integer age;
    private String gender;
}
