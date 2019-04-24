package com.proxy;

/**
 * 抽象对象角色，目标对象和代理对象都实现此接口，这样所有使用目标对象的地方都可以使用代理对象
 */
public abstract class AbstractObject {

    public abstract void operation();
}
