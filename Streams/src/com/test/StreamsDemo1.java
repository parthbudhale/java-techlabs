package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo1 {
	 public static void main(String[] args) {
		  List<Integer> numbers = new ArrayList<Integer>();
		  List<Integer> numbers2 = Arrays.asList(1,2,3,6,5,4,4,1,2,5,7,8,9,90);
		  List<Integer> numbers3 = Arrays.asList(9,8,7,6,5,4,3,2,1);
		  
		  for(int i = 1; i <= 30; i++)
		  {
		   numbers.add(i);
		  }
		  System.out.println("Original List : ");
		  System.out.println(numbers);
		  
		  Stream<Integer> st = numbers.stream();
		  List<Integer> list = st.filter(i -> i % 3 == 0).collect(Collectors.toList());
		  System.out.println();
		  System.out.println(list);
		  
		  long length = numbers.stream().count();
		  System.out.println("length of list : "+length);
		  
		  List<Integer> n = list.stream().filter(i -> i > 20).collect(Collectors.toList());
		  System.out.println("numbers greater than 20 : "+ n);
		  
		  List<Integer> n2 = numbers2.stream().distinct().collect(Collectors.toList());
		  System.out.println(n2);
		  
		  List<Integer> n3 = numbers2.stream().distinct().filter(i -> i > 20).collect(Collectors.toList());
		  System.out.println(n3);
		  
		  System.out.println(numbers2.stream().distinct().filter(i -> i > 5).limit(2).collect(Collectors.toList()));
		  System.out.println(numbers2.stream().distinct().filter(i -> i > 5).count());
		  
		  //sorted()
		  System.out.println(numbers.stream().sorted().collect(Collectors.toList()));
		  
		  //2nd largest
		  System.out.println(numbers.stream().sorted((a,b)->b-a).skip(1).limit(1).collect(Collectors.toList()));
		  
		  //smallest number
		  System.out.println(numbers.stream().sorted().limit(1).collect(Collectors.toList()));
		  
		  //even number in descending order
		  System.out.println(numbers.stream().filter(i -> i % 2==0).sorted((a,b) -> b-a).collect(Collectors.toList()));
		 }
		}