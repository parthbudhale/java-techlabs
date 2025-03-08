package com.violation.test;

import com.violation.model.BankAccount;

public class BankTest {
	 public static void main(String[] args) {
	        BankAccount account = new BankAccount("12345", 1000);
	        account.deposit(500);
	        account.withdraw(200);
	        account.withdraw(2000);
	    }
	}



