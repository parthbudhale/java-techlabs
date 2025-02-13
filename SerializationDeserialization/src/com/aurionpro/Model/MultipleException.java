package com.aurionpro.Model;

public class MultipleException {
	public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // Accessing an out-of-bounds index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception caught.");
        } 
        catch (Exception e) {
            System.out.println("General Exception caught.");
        }

	}
}
