package ru.a148ru.examples.passcode;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test {

    public static void main(String[] args) {
        run();
    }

    // example1 - Плохой пример, дублирование кода

    public static List<Apple> filterGreenApples(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();

        for(Apple apple: inventory){
            if (Color.GREEN.equals(apple.getColor())){
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterHeavyApples(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();

        for (Apple apple: inventory){
            if (apple.getWeight() > 150){
                result.add(apple);
            }
        }
        return result;
    }
    //end example1

    // example2  
    private static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p){
        List<Apple> result = new ArrayList<>();
        for(Apple apple: inventory){
            if(p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }

    public static void run(){

        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(Color.GREEN, 160));
        inventory.add(new Apple(Color.GREEN, 130));
        inventory.add(new Apple(Color.RED, 170));


        List<Apple> greenApples = filterApples(inventory, Apple::isGreenApple);
        List<Apple> heawyApples = filterApples(inventory, Apple::isHeavyApple);

        System.out.println(greenApples);
        System.out.println(heawyApples);
    }
}
