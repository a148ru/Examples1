package ru.a148ru.examples.patterns.factory;

public final class Circle extends Shape{
    
    Circle(){
        super(ShapeType.CIRCLE);
        generate();
    }
    @Override
    protected void generate(){
        System.out.println("Generating a Circle");
    }
}
