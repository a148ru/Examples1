package ru.a148ru.examples.lambdas.passcode;

public class Apple {

    Color color;
    int weight;

    public Apple(Color color, int weight){
        this.color = color;
        this.weight =weight;
    }
    
    public Color getColor(){
        return color;
    }

    public int getWeight() {
       return weight;
    }



    public static boolean isGreenApple(Apple apple){
        return Color.GREEN.equals(apple.getColor());
    }
     
    public static boolean isHeavyApple(Apple apple){
        return apple.getWeight() > 150;
    }
}