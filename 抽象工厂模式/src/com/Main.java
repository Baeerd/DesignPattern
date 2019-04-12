package com;

import com.engine.ComputerEngineer;
import com.factory.AmdFactory;
import com.factory.IntelFactory;

public class Main {

    public static void main(String[] args) {
        ComputerEngineer computerEngineer = new ComputerEngineer();
        computerEngineer.makeComputer(new IntelFactory());
    }

}
