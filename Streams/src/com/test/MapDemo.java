package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {
	public static void main(String[] args) {
		List<String> topics = Arrays.asList("Inheritance", "Functional Interface","Collections","Streams","Enum");
		  
		  List<String> upperCase = topics.stream().map(String::toUpperCase).collect(Collectors.toList());
		  System.out.println(upperCase);
		  
		  List<String> lowerCase = topics.stream().map(String::toLowerCase).collect(Collectors.toList());
		  System.out.println(lowerCase);
		  
		  List<Integer> length = topics.stream().map(String::length).collect(Collectors.toList());
		  System.out.println(length);
		  
		  List<String> postfix = topics.stream().map(i -> i+".java").collect(Collectors.toList());
		  System.out.println(postfix);
		  
		  List<Integer>asciSum = topics.stream().map(i-> i.chars().sum()).collect(Collectors.toList());
		  System.out.println(asciSum);
		  
		  
		
		
		
	}

}
