package com.factory;

import com.cpu.Cpu;
import com.cpu.IntelCpu;
import com.mainboard.IntelMainboard;
import com.mainboard.Mainboard;

public class IntelFactory implements AbstractFactory {
    @Override
    public Cpu createCpu() {
        return new IntelCpu(755);
    }

    @Override
    public Mainboard createMainboard() {
        return new IntelMainboard(755);
    }
}
