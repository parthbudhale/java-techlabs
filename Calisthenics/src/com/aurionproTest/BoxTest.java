package com.aurionproTest;

import java.util.Scanner;

class Box {
    int width;
    int height;
    int depth;

    public Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public void display() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Depth: " + depth);
    }
}

class BoxWeight extends Box {
    int weight;

 
    public BoxWeight(int width, int height, int depth, int weight) {
        super(width, height, depth); // Calls the parent class constructor
        this.weight = weight;
    }

    public void displayWeight() {
        display(); // Call parent class display method
        System.out.println("Weight: " + weight);
    }
}

public class BoxTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter Width: ");
        int width = scanner.nextInt();

        System.out.print("Enter Height: ");
        int height = scanner.nextInt();

        System.out.print("Enter Depth: ");
        int depth = scanner.nextInt();

        System.out.print("Enter Weight: ");
        int weight = scanner.nextInt();

    
        BoxWeight boxWeight = new BoxWeight(width, height, depth, weight);

     
        System.out.println("\n--- Box Details ---");
        boxWeight.displayWeight();

     
        scanner.close();
    }
}
