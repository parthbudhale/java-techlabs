package com.aurionpro.loops;
import java.util.*;
public class SwitchCase {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Month Number: ");
		int month=scanner.nextInt();
		
		
		switch(month) {
		case 1:
		case 2:
		case 3:
			System.out.println("month "+month+" comes in Winter");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("month "+month+" comes in Summer");
			break;
			
		case 7:
		case 8:
		case 9:
			System.out.println("month "+month+" comes in Monsoon");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println("month "+month+" comes in Spring");
			break;
			default:
			System.out.println("Invalid Month number");
		}
		scanner.close();
	}

}
