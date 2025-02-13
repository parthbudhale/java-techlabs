package com.aurionpro.array;
import java.util.Scanner;
public class SubstringHW {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Taking input for main string
	        System.out.print("Enter the main string: ");
	        String mainString = scanner.nextLine();

	        // Taking input for substring
	        System.out.print("Enter the substring to find: ");
	        String subString = scanner.nextLine();

	        scanner.close(); 

	        // Checking if substring exists in main string
	        if (mainString.contains(subString)) {
	            int index = mainString.indexOf(subString); // Getting the starting index
	            System.out.println("Substring found at index: " + index);
	        } else {
	            System.out.println("Substring not found.");
	        }
	    
	}


}
