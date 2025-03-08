package com.test;

import java.util.function.Function;

public class FuctionDemo {
	public static void main(String[] args) {
		Function<Integer,Integer> square = num  -> num*num;
		System.out.println("Square :"+square.apply(2));
		System.out.println("----------------------------------------");
		
		Function<String,String> test = num  -> "parth";
		System.out.println("Name :"+test.apply("bala"));
		
		System.out.println("=========================================");
		Function<String,Integer> length= num  -> num.hashCode();
		System.out.println("Name :"+length.apply("bala"));
		
		
		
	}

}
