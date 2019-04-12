package com.singleton;

/**
 * 单例模式最优解决方式，定义内部枚举，枚举的初始化JVM提供线程安全保证
 * 枚举不会被反射，第一次使用才会创建对象，做到了延迟加载
 */
public class EnumSingleton {

    // 构造方法私有化
    private EnumSingleton() {}

    public static EnumSingleton getInstance() {
        // 调用时才会加载枚举类，执行枚举的构造方法
        return InEnumSingleton.INSTANCE.getInstance();
    }

    private static enum InEnumSingleton{
        INSTANCE;

        private EnumSingleton enumSingleton;

        // 创建枚举类的时候，创建单例对象
        private InEnumSingleton() {
            enumSingleton = new EnumSingleton();
        }

        public EnumSingleton getInstance() {
            return enumSingleton;
        }
    }
}
