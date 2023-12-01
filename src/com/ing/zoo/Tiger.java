package com.ing.zoo;

import java.util.Random;

public class Tiger extends Animal implements Carnivore, Performer {

    public Tiger(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("rraaarww");
    }

    @Override
    public void eatMeat() {
        System.out.println("nomnomnom oink wubalubadubdub");
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            System.out.println("jumps in a tree");
        } else {
            System.out.println("scratches ears");
        }
    }
}
