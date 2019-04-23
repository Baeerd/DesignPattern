package com.design.facade;

import com.design.module.ModuleA;
import com.design.module.ModuleB;
import com.design.module.ModuleC;

/**
 * 对外发布的方法，客户端通过调用此类中的方法实现对各个子系统交互
 */
public class Facade {

    public void test() {
        ModuleA moduleA = new ModuleA();
        ModuleB moduleB = new ModuleB();
        ModuleC moduleC = new ModuleC();

        moduleA.testA();
        moduleB.testB();
        moduleC.testC();
    }
}
