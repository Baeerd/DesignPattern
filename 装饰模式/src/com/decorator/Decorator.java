package com.decorator;

/**
 * 装饰角色
 */
public class Decorator implements Component{

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void sampleOperation() {
        System.out.println("公共装饰方法执行（-）......");
        component.sampleOperation();
        System.out.println("公共装饰方法执行（+）......");
    }
}
