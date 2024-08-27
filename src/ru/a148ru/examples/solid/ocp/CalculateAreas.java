package ru.a148ru.examples.solid.ocp;

public class CalculateAreas {
    private double area;

    public double calcArea(Rectangle r){
        area = r.getLenght() * r.getWidth();
        return  area;
    }
}
