package com.decorator;

import com.decorator.impl.ConcreteComponent;

public class Main {

    public static void main(String[] args) {
        Decorator decorator = new Decorator(new ConcreteComponent());
        decorator.sampleOperation();

        System.out.println("===========================================");

        Decorator decorator1 = new ConcreteDecoratorA(new ConcreteComponent());
        decorator1.sampleOperation();
    }
}
