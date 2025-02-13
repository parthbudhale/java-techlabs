package com.aurionpro.loops;
import java.util.Scanner;
public class Palindrome {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        if (isPalindrome(number)) {
	            System.out.println(number + " is a palindrome.");
	        } else {
	            System.out.println(number + " is not a palindrome.");
	        }
	     
	    }
	    public static boolean isPalindrome(int number) {
	        
	        if (number < 0) {
	            return false;
	        }

	        int originalNumber = number; 
	        int reversedNumber = 0;  
	        
	        while (number != 0) {
	            int lastDigit = number % 10; 
	            reversedNumber = reversedNumber * 10 + lastDigit;  
	            number = number / 10;  
	        }
	        
	        return originalNumber == reversedNumber;
	    }
	}



