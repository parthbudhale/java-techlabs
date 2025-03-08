package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo2 {

 public static void main(String[] args) {

  List<String> names = Arrays.asList("Prathamesh110","sanjana","bal5a","parth","bobby");
  
  Stream<String> st = names.stream();
  st.forEach(System.out::println);
  
  
  String[] names2 = {"Prathamesh10","sanjana","bala","parth5","bobby5","bobby"};
  Stream<String> stt = Stream.of(names2);
  List<String> s = stt.filter(i -> i.startsWith("b")).collect(Collectors.toList());
  System.out.println(s);
  
  //
  System.out.println(names.stream().filter(i -> i.endsWith("a")).collect(Collectors.toList()));
  
  System.out.println(names.stream().filter(i -> i.length()>4).collect(Collectors.toList()));
  
  System.out.println(names.stream().filter(i -> i.contains("y")).collect(Collectors.toList()));
  
  System.out.println(names.stream().distinct().collect(Collectors.toList()));
  
  //System.out.println(names.stream().map(i -> i.toUpperCase()).collect(Collectors.toList()));
  
  System.out.println(names.stream().filter(i -> i.matches(".*\\d.*")).collect(Collectors.toList()));
  
  

  
 
 }

}