package ru.a148ru.examples.solid.ocp;

public class OpenClosed {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(1,2);
        CalculateAreas ca = new CalculateAreas();
        System.out.println("Area = " + ca.calcArea(r));
    }
}
