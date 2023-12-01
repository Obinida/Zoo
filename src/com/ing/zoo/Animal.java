package com.ing.zoo;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello, I am an animal. My name is " + name);
    }

    public String getName() {
        return name;
    }
}
