package ru.a148ru.examples.patterns.factory;

public class Triangle extends Shape{
    
    Triangle(){
        super(ShapeType.TRINGLE);
        generate();
    }

    protected void generate(){
        System.out.println("Generating a Triangle");
    }
}
