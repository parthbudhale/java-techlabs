package com.aurionpro.Model;

public interface ATMOperations {
	void withdraw(double amount) throws InsufficientFundsException;
	void deposit(double amount);
	void CheckBalance();

}
