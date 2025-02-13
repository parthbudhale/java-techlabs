package com.aurionproTest;

import java.util.Scanner;

import com.aurionproModel.Bank;

public class BankTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Bank customer1 = new Bank();
		System.out.println("Enter your name : ");
		customer1.holderName = sc.nextLine();
		System.out.println("Enter the amount you want to deposit : ");
		long deposit = sc.nextLong();
		customer1.deposit(deposit);
		System.out.println("Enter the amount you want to Withdraw : ");
		long withdraw = sc.nextLong();
		customer1.withdraw(withdraw);
	}
}
