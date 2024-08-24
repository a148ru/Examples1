package ru.a148ru.examples.patterns.factory;

public class ShapeFactory {
    /**
     * @param sType
     * @return Shape
     */
    public static Shape generateShape(ShapeType sType)throws Exception{
        Shape shape =null;
        switch(sType){
            case CIRCLE -> shape = new Circle();
            case SQUARE -> shape = new Square();
            case TRINGLE -> shape = new Triangle();
            default -> {
                     throw new Exception("Error create shape object. No type shape");
            }
        }

        return shape;
    }
}
