package ru.a148ru.examples.patterns.factory;

public final class Square extends Shape{
    
    Square(){
        super(ShapeType.SQUARE);
        generate();
    }

    @Override
    protected void generate(){
        System.out.println("Generating a Square");
    }
}
