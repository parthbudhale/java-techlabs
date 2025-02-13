package com.aurionproTest;

import com.aurionproTest.Account.AccountDetails;

public class Account1 {
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
