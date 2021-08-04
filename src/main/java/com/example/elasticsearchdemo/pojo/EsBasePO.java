package com.example.elasticsearchdemo.pojo;

import lombok.Data;
import lombok.Getter;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.UUID;

/**
 * @author tianzh
 * @date 2021年08月01日
 */
@Getter
public class EsBasePO implements Serializable {

    private static final long serialVersionUID = -1535163875018909468L;
    /**
     * 文档的唯一id  UUID, 不当作document的一部分 不参与json转化
     */
    private transient String esId;

    /**
     * index 的type 默认doc
     * 这个在es新版本已经不建议用
     */
    private transient String type;

    /**
     * 索引名称
     */
    private transient String indexName;

    public EsBasePO(){
        // TODO 生成的方式后续可以进行改造,不一定必须用这个UUID生成方式，可灵活化
        this.esId = UUID.randomUUID().toString();
        this.type = "doc";
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }
}
