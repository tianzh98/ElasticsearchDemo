package com.example.elasticsearchdemo.common.enums;

/**
 * @author tianzh
 * @date 2021年08月01日
 */
public enum ENEsIndex {

    /**
     * se_bd 对应es中的index
     */
    INDEX_SE_BD("se_bd"),
    INDEX_PERSON_ES_TEST("person_es_test");

    private String value;

    ENEsIndex(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
