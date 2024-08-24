package ru.a148ru.examples.patterns.factory;

public class Circle extends Shape{
    
    Circle(){
        super(ShapeType.CIRCLE);
        generate();
    }

    protected void generate(){
        System.out.println("Generating a Circle");
    }
}
