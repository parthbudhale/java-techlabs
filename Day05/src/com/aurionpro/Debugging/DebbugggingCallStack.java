package com.aurionpro.Debugging;
import java.util.*;
public class DebbugggingCallStack {
	public static void main(String[] args) {
		System.out.println("main starts");
		function1();
		System.out.println("main ends");	
	}
public static void function1() {
	System.out.println("Function 1 starts");
	function2();
	System.out.println("Function 1 ends");
}
public static void function2() {
	System.out.println("Function 2 starts");
	function3();
	System.out.println("Function 2 ends");
}
public static void function3() {
	System.out.println("Function 3 starts");
	
	
}

}
