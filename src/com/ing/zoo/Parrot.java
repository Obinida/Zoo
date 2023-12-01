package com.ing.zoo;

import java.util.Random;

public class Parrot extends Animal implements Herbivore, Performer {

    public Parrot(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("squawk");
    }

    @Override
    public void eatLeaves() {
        System.out.println("chomp chomp");
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            System.out.println("repeats phrases");
        } else {
            System.out.println("flies in circles");
        }
    }
}
