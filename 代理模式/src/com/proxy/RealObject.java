package com.proxy;

/**
 * 目标对象角色
 */
public class RealObject extends AbstractObject {

    @Override
    public void operation() {
        System.out.println("目标对象执行...");
    }
}
