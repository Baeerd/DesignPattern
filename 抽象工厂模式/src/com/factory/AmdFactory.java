package com.factory;

import com.cpu.AmdCpu;
import com.cpu.Cpu;
import com.mainboard.AmdMainboard;
import com.mainboard.Mainboard;

public class AmdFactory implements AbstractFactory {
    @Override
    public Cpu createCpu() {
        return new AmdCpu(938);
    }

    @Override
    public Mainboard createMainboard() {
        return new AmdMainboard(938);
    }
}
