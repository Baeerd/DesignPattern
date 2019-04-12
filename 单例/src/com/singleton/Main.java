package com.singleton;

public class Main {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);

        Singleton2 singleton2 = Singleton2.getInstance();
        System.out.println(singleton2);

        EnumSingleton instance = EnumSingleton.getInstance();
        System.out.println(instance == EnumSingleton.getInstance());
    }

}
