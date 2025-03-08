package com.aurionpro.test;

import java.util.Map;
import java.util.Scanner;
import com.aurionpro.model.StringProcessor;

public class StringTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String input = scanner.nextLine();

		boolean palindromeCheck = StringProcessor.isPalindrome(input);
		Map<Character, Integer> charOccurrences = StringProcessor.countCharacterOccurrences(input);
		String reversed = StringProcessor.reverseString(input);
		String duplicates = StringProcessor.findDuplicateCharacters(input);

		System.out.println("\nResults:");
		System.out.println("1. Is Palindrome? " + (palindromeCheck ? "Yes" : "No"));
		System.out.println("2 Character Occurrences:");

		for (Map.Entry<Character, Integer> entry : charOccurrences.entrySet())
		{
			System.out.println("   " + entry.getKey() + " → " + entry.getValue());
		}

		System.out.println("3️ Reversed String: " + reversed);
		System.out.println("4️ Duplicate Characters: " + (duplicates.isEmpty() ? "None" : duplicates));

		scanner.close();
	}
}