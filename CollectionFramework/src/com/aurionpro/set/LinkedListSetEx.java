package com.aurionpro.set;

import java.util.*;

public class LinkedListSetEx {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        
        
        for (int i = 0; i < 20; i++) {
            set.add(i);
        }
        System.out.println("Initial Set: " + set);
       
        set.remove(5);
        System.out.println("After removing 5: " + set);
        
        
        System.out.println("Contains 10?: " + set.contains(10));
        
        System.out.println("Size of Set: " + set.size());
        
        System.out.println("Is Set Empty?: " + set.isEmpty());
        
        Set<Integer> clonedSet = new LinkedHashSet<>(set);
        System.out.println("Cloned Set: " + clonedSet);
        
        
        System.out.print("Elements in Set: ");
        for (Integer num : set) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        set.clear();
        System.out.println("After clearing Set: " + set);
        System.out.println("Is Set Empty After Clearing?: " + set.isEmpty());
        
       
        LinkedList<Integer> list = new LinkedList<>(clonedSet);
        System.out.println("Converted LinkedList: " + list);
        
      
        list.addFirst(99);
        list.addLast(100);
        list.removeFirst();
        list.removeLast();
        System.out.println("Modified LinkedList: " + list);
    }
}