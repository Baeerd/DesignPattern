package com.design;

import com.design.facade.Facade;

public class Client {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.test();
    }
}
