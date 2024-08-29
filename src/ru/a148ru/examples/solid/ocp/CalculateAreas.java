package ru.a148ru.examples.solid.ocp;

public class CalculateAreas {
    private double area;

    public double calcArea(Shape s){
        area = s.getArea();
        return  area;
    }
}
