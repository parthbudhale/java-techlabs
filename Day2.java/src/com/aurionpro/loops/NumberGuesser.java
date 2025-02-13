package com.aurionpro.loops;
import java.util.*;
	public class NumberGuesser {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        
	        boolean playAgain = true;

	        while (playAgain) {
	            int numberToGuess = random.nextInt(100) + 1; // Generates a number between 1 and 100
	            int attempts = 0;
	            int userGuess = 0;

	            System.out.println("\nWelcome to the Number Guesser Game!");
	            System.out.println("I have generated a number between 1 and 100. Try to guess it!");

	            while (userGuess != numberToGuess) {
	                System.out.print("Enter your guess: ");
	                userGuess = scanner.nextInt();
	                attempts++;

	                if (userGuess < numberToGuess) {
	                    System.out.println("Sorry, Too Low! Try again.");
	                } else if (userGuess > numberToGuess) {
	                    System.out.println("Sorry, Too High! Try again.");
	                } else {
	                    System.out.println("\n🎉 Congratulations! You guessed the correct number: " + numberToGuess);
	                    System.out.println("Total attempts: " + attempts);
	                    
	                }
	            }

	            System.out.print("\nDo you want to play again? (yes/no): ");
	            String response = scanner.next().toLowerCase();
	            playAgain = response.equals("yes");
	        }

	        System.out.println("\nThanks for playing! Goodbye! 😊");
	        scanner.close();
	    }
	}

