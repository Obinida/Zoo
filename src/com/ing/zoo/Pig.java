package com.ing.zoo;

import java.util.Random;

public class Pig extends Animal implements Omnivore, Performer {

    public Pig(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("splash");
    }

    @Override
    public void eatLeaves() {
        System.out.println("munch munch oink");
    }

    @Override
    public void eatMeat() {
        System.out.println("nomnomnom oink thx");
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            System.out.println("rolls in the mud");
        } else {
            System.out.println("runs in circles");
        }
    }
}
