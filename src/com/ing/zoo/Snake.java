package com.ing.zoo;

public class Snake extends Animal implements Carnivore {

    public Snake(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("hisssss");
    }

    @Override
    public void eatMeat() {
        System.out.println("gulp");
    }
}
