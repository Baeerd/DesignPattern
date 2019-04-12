package com.build;

import com.build.builder.Builder;
import com.build.builder.GoodByeBuilder;
import com.build.builder.WelcomBuilder;
import com.build.director.Director;
import com.build.entity.AbstractMessage;

public class Main {

    public static void main(String[] args) {
        // 创建建造者
        Builder builder = new GoodByeBuilder();
        // 创建导演者
        Director director = new Director(builder);
        // 构造产品
        director.construct("toAddress:1111111.com", "fromAddress:22222.com");
        // 获取完整产品实例
        AbstractMessage message = builder.sendMessage();
        System.out.println("产品实例：" + message);
    }
}
