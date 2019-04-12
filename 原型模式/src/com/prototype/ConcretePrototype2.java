package com.prototype;

public class ConcretePrototype2 implements Prototype {

    private String name;

    @Override
    public Prototype clone() {
        ConcretePrototype2 concretePrototype2 = new ConcretePrototype2();
        concretePrototype2.setName(this.name);
        return concretePrototype2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
