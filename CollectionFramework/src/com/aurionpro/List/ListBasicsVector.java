package com.aurionpro.List;

import java.util.Vector;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class ListBasicsVector {
    public static void main(String[] args) {
        // Declaration
        List<Integer> list = new Vector<>();
        Vector<Integer> list1 = new Vector<>();

        // Adding list
        list1.add(500);
        list1.add(50);
        list1.add(100);
        list1.add(450);
        list1.add(666);

        // Methods
        System.out.println("Contains method: " + list1.contains(100));
        System.out.println("Size method: " + list1.size());
        System.out.println("Get method: " + list1.get(2));
        System.out.println("IndexOf method: " + list1.indexOf(666));
        list1.remove(1);
        System.out.println("After remove method: " + list1);
        list1.set(2, 60);
        System.out.println("After set method: " + list1);
        
        // Sort method
        Collections.sort(list1);
        System.out.println("After sort method: " + list1);
        
        // For-each loop to print elements
        System.out.println("List elements using for-each loop:");
        for (int num : list1) {
            System.out.println(num);
        }
        
        // Iterator to print elements
        System.out.println("List elements using Iterator:");
        Iterator<Integer> iterator = list1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        list1.clear();
        System.out.println("After clear method: " + list1.isEmpty());
    }
}
