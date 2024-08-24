package ru.a148ru.examples.patterns.factory;

public abstract class Shape {

    @SuppressWarnings("unused")
    private ShapeType sType = null;
    
    public Shape(ShapeType sType){
        this.sType = sType;
    }

    protected abstract void generate();
}
