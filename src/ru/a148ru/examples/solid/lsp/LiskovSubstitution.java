package ru.a148ru.examples.solid.lsp;

public class LiskovSubstitution {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(1, 2);
        System.out.println("Area = "+r.calcArea());

        Square s =new Square(2);
        System.out.println("Area = "+s.calcArea());
    }
}
