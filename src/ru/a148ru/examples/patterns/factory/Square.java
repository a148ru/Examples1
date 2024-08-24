package ru.a148ru.examples.patterns.factory;

public class Square extends Shape{
    
    Square(){
        super(ShapeType.SQUARE);
        generate();
    }

    protected void generate(){
        System.out.println("Generating a Square");
    }
}
