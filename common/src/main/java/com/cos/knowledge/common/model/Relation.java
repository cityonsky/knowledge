package com.cos.knowledge.common.model;

import lombok.Data;

/**
 * @author sky
 * @date 2016/1/20.
 */
@Data
public class Relation {

    public enum Type {
        TOPIC2TOPIC,
        TOPIC2DOC,
        DOC2DOC
    }

    @Data
    public class Edge {

        private long id;

        private Type type;

        private String name;

        private String description;

    }

    private long id;

    private Type type;

    private long start;

    private long end;

    private Edge edge;
}
