package com.aurionproTest;

public class Account {

	public static class AccountDetails {
		long accountnumber;
		String accountType;
		String name;
		long balance;

		void printDetails() {
			System.out.println(accountnumber);
			System.out.println(accountType);
			System.out.println(name);
			System.out.println(balance);

		}
	}

	public static void main(String[] args) {
		AccountDetails ad = new AccountDetails();
		ad.accountnumber = 12345678l;
		ad.accountType = "Savings";
		ad.name = "Parth";
		ad.balance = 10000l;

		// System.out.println(ad.accountnumber);
		// System.out.println(ad.accountType);
		// System.out.println(ad.name);
		// System.out.println(ad.balance);
		ad.printDetails();

	}

}
