package com.aurionpro.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetsExamples {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        
        // Adding elements
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        set.add("F");
        set.add(null);
        
        System.out.println("Initial Set: " + set);
        
       
        set.remove("A");
        System.out.println("After removing 'A': " + set);
        
        System.out.println("Contains 'B': " + set.contains("B"));
        System.out.println("Contains 'X': " + set.contains("X"));
        
        System.out.println("Size of Set: " + set.size());
        
        System.out.println("Is Set Empty?: " + set.isEmpty());
        
        Set<String> clonedSet = new HashSet<>(set);
        System.out.println("Cloned Set: " + clonedSet);
        
        System.out.print("Elements in Set: ");
        for (String s : set) {
            System.out.print(s + " ");
        }
        System.out.println();
        
        set.clear();
        System.out.println("After clearing Set: " + set);
        System.out.println("Is Set Empty After Clearing?: " + set.isEmpty());
    }
}
