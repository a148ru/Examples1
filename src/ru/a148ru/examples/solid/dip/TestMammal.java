package ru.a148ru.examples.solid.dip;

public class TestMammal {
    public static void main(String[] args) {
        Mammal cat = new Mammal(new CatNoise());
        Mammal dog = new Mammal(new DogNoise());

        System.out.println("Cat says "+ cat.makeNoise());
        System.out.println("Dog says "+ dog.makeNoise());
    }
}
