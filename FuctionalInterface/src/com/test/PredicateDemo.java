package com.test;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		 Predicate<Integer> isEven = num -> num %2==0;
		 BiPredicate<Integer, Integer> isSumEven = (a, b) -> (a + b) % 2 == 0;
		System.out.println(isEven.test(10));
		System.out.println(isEven.test(20));
		
		System.out.println("================================================");
		
	
	        
	        System.out.println(isSumEven.test(3, 5)); // true (sum is 8)
	        System.out.println(isSumEven.test(2, 3)); // false (sum is 5)
		
	}

}
