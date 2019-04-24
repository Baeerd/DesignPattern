package com.proxy;

public class Main {

    public static void main(String[] args) {
        AbstractObject object = new ProxyObject();
        object.operation();
    }
}
