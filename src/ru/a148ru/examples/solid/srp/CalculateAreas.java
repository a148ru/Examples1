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
        for(int i=0;i<shapes.length; i++){
            sumTotal = sumTotal + shapes[i].calcArea();
        }
        return sumTotal;
    }

    public void output(){
        System.out.println("Total of all areas = " + sumTotal);
    }
}