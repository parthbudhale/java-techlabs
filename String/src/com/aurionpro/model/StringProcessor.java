package com.aurionpro.model;

import java.util.HashMap;
import java.util.Map;

public class StringProcessor {

	public static boolean isPalindrome(String input) {
		if (input == null || input.isEmpty()) {
			return false;
		}
		String reversed = new StringBuilder(input).reverse().toString();
		return input.equalsIgnoreCase(reversed);
	}

	public static Map<Character, Integer> countCharacterOccurrences(String input) {
		Map<Character, Integer> charCountMap = new HashMap<>();
		if (input == null || input.isEmpty()) {
			return charCountMap;
		}

		for (char c : input.toCharArray()) {
			charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
		}
		return charCountMap;
	}

	public static String reverseString(String input) {
		if (input == null || input.isEmpty()) {
			return "";
		}
		return new StringBuilder(input).reverse().toString();
	}

	public static String findDuplicateCharacters(String input) {
		if (input == null || input.isEmpty()) {
			return "";
		}

		Map<Character, Integer> charCountMap = new HashMap<>();
		StringBuilder duplicates = new StringBuilder();

		for (char c : input.toCharArray()) {
			charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			if (entry.getValue() > 1) {
				duplicates.append(entry.getKey()).append(" ");
			}
		}

		return duplicates.toString().trim();
	}
}