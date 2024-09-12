package ru.a148ru.examples.composition.dependence;

public class TestDog {
    public static void main(String args[]){
        System.out.println("Composition over Inheritance");
        System.out.println("\nDog");

        //IWalkable iwalkable = new Walkable();
        Dog fido = new Dog();
        fido.setWalker(new Walkable());
        fido.eat();
       // fido.walker.walk();
    }
}
