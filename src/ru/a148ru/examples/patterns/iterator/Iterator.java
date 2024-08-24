package ru.a148ru.examples.patterns.iterator;

import java.util.ArrayList;

public class Iterator {
    public static void runIterator(){
        // Instantite an ArrayList
        ArrayList<String> names = new ArrayList<>();

        // Add values to the Arraylist

        names.add("Joe");
        names.add("Mary");
        names.add("Bob");
        names.add("Sue");

        // Now Iterate through the names
        System.out.println("Names:");
        iterate(names);
    }

    private static void iterate(ArrayList<String> arl){
        for(String listItem:arl){
            System.out.println(listItem);
        }
    }
}
