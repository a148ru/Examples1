package ru.a148ru.examples.solid.ocp;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(double l, double w){
        this.length = l;
        this.width = w;
    }

    public double getLenght(){
        return this.length; 
    }

    public double getWidth(){
        return this.width;
    }
}
