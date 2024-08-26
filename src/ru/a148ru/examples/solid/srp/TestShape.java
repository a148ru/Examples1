package ru.a148ru.examples.solid.srp;

public class TestShape {
    public static void main(String[] args) {
        System.out.println("HW");
        Circle circle = new Circle(1);
        Shape[]shapeAreay = new Shape[1];
        shapeAreay[0] = circle;

        CalculateAreas ca = new CalculateAreas(shapeAreay);
        ca.sumAreas();
        new OutputAreas(ca.sumTotal).console();
        new OutputAreas(ca.sumTotal).HTML();
    }
}
