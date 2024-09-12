package ru.a148ru.examples.composition.dependence;

public class Dog extends Mammal {

    IWalkable walker;

    public void setWalker( IWalkable w){
        this.walker=w;
        w.walk();
    }

    /*
    @Override
    public void walk() {
        System.out.println("I am Walking");
    }
    */
}
