package ru.a148ru.examples.patterns.factory;

public final class Triangle extends Shape{
    
    Triangle(){
        super(ShapeType.TRINGLE);
        generate();
    }

    @Override
    protected void generate(){
        System.out.println("Generating a Triangle");
    }
}
