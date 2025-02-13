package com.aurionpro.loops;
import java.util.*;
public class PigGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int totalScore = 0; // Player's total score
		int turnScore; // Score for each turn
		int turnCount = 0; // Number of turns taken

		System.out.println("Welcome to PIG Dice Game!");

		// Play until the total score reaches 20 or more
		while (totalScore < 20) {
			turnScore = 0;
			turnCount++;

			System.out.println("\nTURN " + turnCount);

			// Start a new turn
			while (true) {
				System.out.print("Roll or hold? (r/h): ");
				String action = scanner.nextLine().toLowerCase();

				if (action.equals("r")) {
					// Simulate the roll of the die (1 to 6)
					int die = random.nextInt(6) + 1;
					System.out.println("Die: " + die);

					if (die == 1) {
						System.out.println("Turn over. No score.");
						break; // End the turn if the die is 1
					}

					// Add the rolled value to the current turn score
					turnScore += die;

				} else if (action.equals("h")) {
					// Save points and end the turn
					totalScore += turnScore;
					System.out.println("Score for turn: " + turnScore);
					System.out.println("Total score: " + totalScore);
					break;
				} else {
					System.out.println("Invalid input. Please enter 'r' to roll or 'h' to hold.");
				}

				// If the player reaches 20, end the game
				if (totalScore >= 20) {
					System.out.println("You finished in " + turnCount + " turns!");
					System.out.println("Game over!");
					return;
				}
			}
		}

		scanner.close();
	}
}
