package com.ing.zoo;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        Animal[] animals = initializeAnimals();

        try (Scanner scanner = new Scanner(System.in)) {
            processCommands(scanner, animals);
        }

        System.out.println("Exiting program...");
    }

    private static Animal[] initializeAnimals() {
        return new Animal[] {
                new Lion("henk"),
                new Hippo("elsa"),
                new Pig("dora"),
                new Tiger("wally"),
                new Zebra("marty"),
                new Snake("monty"),
                new Parrot("rio")
        };
    }

    private static void processCommands(Scanner scanner, Animal[] animals) {
        while (true) {
            System.out.print("Enter your command (type 'exit' to quit): ");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                break;
            }

            if (input.startsWith("hello ")) {
                handleHelloCommand(input.substring(6), animals);
            } else {
                handleOtherCommands(input, animals);
            }
        }
    }

    private static void handleHelloCommand(String animalName, Animal[] animals) {
        boolean found = false;
        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(animalName)) {
                animal.sayHello();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Animal not found: " + animalName);
        }
    }

    private static void handleOtherCommands(String command, Animal[] animals) {
        switch (command) {
            case "hello":
                for (Animal animal : animals) {
                    animal.sayHello();
                }
                break;
            case "give leaves":
                for (Animal animal : animals) {
                    if (animal instanceof Herbivore) {
                        ((Herbivore) animal).eatLeaves();
                    }
                }
                break;
            case "give meat":
                for (Animal animal : animals) {
                    if (animal instanceof Carnivore) {
                        ((Carnivore) animal).eatMeat();
                    }
                }
                break;
            case "perform trick":
                for (Animal animal : animals) {
                    if (animal instanceof Performer) {
                        ((Performer) animal).performTrick();
                    }
                }
                break;
            default:
                System.out.println("Unknown command: " + command);
        }
    }
}
