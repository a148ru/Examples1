package ru.a148ru.examples.bparam;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import ru.a148ru.examples.passcode.Apple;
import ru.a148ru.examples.passcode.Color;

public class RunExample1 {
    public static void main(String[] args) {
        
    }

    // s1
    public static List<Apple> filterGreenApples(List<Apple> inventory){
        List<Apple> result = new ArrayList<>(); // список для накопления яблок
        for(Apple apple: inventory){
            if(Color.GREEN.equals(apple.getColor())){ // выбираем зеленые яблоки
                result.add(apple);
            }
        }
        return result;
    }

    // s2
    public static List<Apple> filterApplesByColor(List<Apple> inventory, Color color){
        List<Apple> result = new ArrayList<>();
        for(Apple apple: inventory){
            if(apple.getColor().equals(color)){
                result.add(apple);
            }
        }
        return result;
    }

    // s3  - новый параметр и дублирование кода, нарушение DRY (Don't Repeat Yourself)
    public static List<Apple> filterApplesByWeight(List<Apple> inventory, int weigth){
        List<Apple> result = new ArrayList<>();
        for(Apple apple:inventory){
            if(apple.getWeight() > weigth){
                result.add(apple);
            }
        }
        return result;
    }

    // s4 фильтрация по всем параметрам
    public static List<Apple> filterApples(List<Apple> inventory, Color color, int weigth, boolean flag){
        List<Apple> result = new ArrayList<>();
        for(Apple apple: inventory){
            if((flag && apple.getColor().equals(color)) || (!flag && apple.getWeight() > weigth)){
                result.add(apple);
            }
        }
        return result;
    }

    //!---------------------------------------------------------------------------------------------

    // s5 стратегия

    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if(p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
    
    // s6 анонимные классы
    public static List<Apple> redApples(List<Apple> list){
        List<Apple> redApple = filterApples(list, new ApplePredicate() {
            @Override
            public boolean test(Apple apple){
                return Color.RED.equals(apple.getColor());
            }
        });
        return redApple;
    }

    // s7 лямбда
    public static List<Apple> redApples2(List<Apple> list){
        List<Apple> redApple = filterApples(list, (Apple apple) -> Color.RED.equals(apple.getColor()));
        return redApple;
    }

    // s8 абстрагирование от типа значений списка
    // 
    public static <T> List<T> filter(List<T> list, Predicate<T> p){
        List<T> result = new ArrayList<>();
        for(T e: list){
            if(p.test(e)){
                result.add(e);
            }
        }
        return result;
    }

}
