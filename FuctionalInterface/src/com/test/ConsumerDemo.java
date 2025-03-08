package com.test;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		Consumer<String> Printmsg = message -> System.out.println("Message 1 to uppercase:" +message.toUpperCase());
		Consumer<String> Printmsg2 = message -> System.out.println("Message 2 to Lowercase:" +message.toLowerCase());
		Consumer<Integer> Printnumber = number -> System.out.println("Number:" +number);
		Printmsg.accept("Parth");
		Printnumber.accept(50);
		BiConsumer<String,Integer> Print=(s,i)  -> System.out.println(s + i);
		Print.accept("hello ", 123);

		
		//consumer Chaining
		
		System.out.println("Consumer Chaining: ");
		Printmsg.andThen(Printmsg2).accept("Hello");
		
	}

}
