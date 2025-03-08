package com.aurionpro.List;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ListExample {
    public static void main(String[] args) {
        // Declaration
        List<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();

        // Adding list
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);

        // Methods
        System.out.println("Contains method: " + list1.contains(30));
        System.out.println("Size method: " + list1.size());
        System.out.println("Get method: " + list1.get(2));
        System.out.println("IndexOf method: " + list1.indexOf(40));
        list1.remove(1);
        System.out.println("After remove method: " + list1);
        list1.set(2, 60);
        System.out.println("After set method: " + list1);
        
        // Sort method
        Collections.sort(list1);
        System.out.println("After sort method: " + list1);
        
        // For loop to print elements
        System.out.println("List elements:");
        for (int num : list1) {
            System.out.println(num);
        }
        
        list1.clear();
        System.out.println("After clear method: " + list1.isEmpty());
    }
}
