package ru.a148ru.examples.solid.srp;

/**
 * CalculateAreas
 */
public class CalculateAreas {
    Shape [] shapes;
    double sumTotal =0;

    public CalculateAreas(Shape [] sh){
        this.shapes = sh;
    }

    public double sumAreas(){
        sumTotal=0;
        for (Shape shape : shapes) {
            sumTotal = sumTotal + shape.calcArea();
        }
        return sumTotal;
    }
}