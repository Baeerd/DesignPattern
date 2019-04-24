package com.proxy;

/**
 * 代理对象角色
 */
public class ProxyObject extends AbstractObject {

    private RealObject realObject = new RealObject();

    @Override
    public void operation() {
        System.out.println("代理对象执行(-)...");
        realObject.operation();
        System.out.println("代理对象执行(+)...");
    }
}
