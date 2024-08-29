package ru.a148ru.examples.solid.ocp;

public class Rectangle extends Shape{
    protected double length;
    protected double width;

    public Rectangle(double l, double w){
        this.length = l;
        this.width = w;
    }

    @Override
    public double getArea() {
        return  length*width;
    }
}
