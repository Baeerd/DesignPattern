package com.decorator.impl;

import com.decorator.Component;

/**
 * 具体待装饰角色
 */
public class ConcreteComponent implements Component {

    @Override
    public void sampleOperation() {
        System.out.println("待装饰角色执行.....");
    }
}
