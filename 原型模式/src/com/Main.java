package com;

import com.prototype.Client;
import com.prototype.ConcretePrototype1;

public class Main {

    public static void main(String[] args) {
        ConcretePrototype1 concretePrototype1 = new ConcretePrototype1();
        concretePrototype1.setName("name1...............");
        Client client = new Client(concretePrototype1);
        System.out.println(concretePrototype1);
        System.out.println(client.operation());

        System.out.println(concretePrototype1.getName());
        System.out.println(client.operation().getName());
    }
}
