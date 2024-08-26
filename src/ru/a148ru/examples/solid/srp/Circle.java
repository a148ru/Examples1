package ru.a148ru.examples.solid.srp;

public class Circle extends Shape {

    private double radius;

    public Circle(double r){
        this.radius =r;
    }

    @Override
    public double calcArea() {
        this.area =3.14*(radius*radius);
        return this.area;
    }
    
}
