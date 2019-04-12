package com.prototype;

public class ConcretePrototype1 implements Prototype {

    private String name;

    @Override
    public Prototype clone() {
        ConcretePrototype1 concretePrototype1 = new ConcretePrototype1();
        concretePrototype1.setName(this.name);
        return concretePrototype1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
