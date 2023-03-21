package org.fasttrackit.homework7.animal;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Cat();
        animals[3] = new Cat();
        animals[4] = new Dog();

        for (Animal animal : animals) {
            System.out.println(animal.talk());
        }
    }
}
