package com.singleton;

/**
 * 懒汉式单例，优点：延迟加载，缺点：线程不安全
 */
public class Singleton {

    private Singleton() {}

    private static Singleton singleton;

    public static Singleton getInstance() {
        if(singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

}
