package com.model;

public class WithdrawMoney implements ATMState {

	@Override
	public void HandleRequest(ATM atms) {
		// TODO Auto-generated method stub
		System.out.println("WITHDRAW MONEY");
		
		atms.setState(new NoCardInserted());
		
	}

}
