package com.factory;

import com.cpu.Cpu;
import com.mainboard.Mainboard;

/**
 * 抽象工厂类，定义创建CPU对象和主板对象方法
 */
public interface AbstractFactory {

    /**
     * 创建CPU对象
     * @return CPU对象
     */
    public Cpu createCpu();
    /**
     * 创建主板对象
     * @return 主板对象
     */
    public Mainboard createMainboard();

}
