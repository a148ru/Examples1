package ru.a148ru.examples.solid.isp;

public class Dog implements IEat,IMakeNoise{

    @Override
    public void makeNoise() {
        System.out.println("Dog is making noise");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
    
}
