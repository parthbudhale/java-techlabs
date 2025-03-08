package com.model;

public class SelectingAccount implements ATMState {

	@Override
	public void HandleRequest(ATM atms) {
		// TODO Auto-generated method stub
		System.out.println("SELECTING ACOUNT");
		
		atms.setState(new WithdrawMoney());
	}

}
