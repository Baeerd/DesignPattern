package com.decorator;

public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void sampleOperation() {
        System.out.println("ConcreteDecoratorA装饰方法执行（-）......");
        super.sampleOperation();
        System.out.println("ConcreteDecoratorA装饰方法执行（+）......");
    }
}
