package ru.a148ru.examples.solid.ocp;

public class Circle extends Shape{
    protected double radius;

    public Circle(double r){
        this.radius = r;
    }

    @Override
    public double getArea(){
        return radius*radius*3.14;
    }
    
}
