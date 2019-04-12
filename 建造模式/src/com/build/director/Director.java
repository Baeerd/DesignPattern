package com.build.director;

import com.build.builder.Builder;

/**
 * 导演者
 * 负责提供建造者每个部件的具体建造顺序
 * 一步一步建造出一个完整的产品对象
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 产品构造方法，负责调用各零件的建造方法
     */
    public void construct(String toAddress , String fromAddress){
        this.builder.buildTo(toAddress);
        this.builder.buildFrom(fromAddress);
        this.builder.buildSubject();
        this.builder.buildBody();
        this.builder.buildSendDate();
    }

}
