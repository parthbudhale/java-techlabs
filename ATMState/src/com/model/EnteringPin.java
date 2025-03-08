package com.model;

public class EnteringPin implements ATMState{

	@Override
	public void HandleRequest(ATM atms) {
		// TODO Auto-generated method stub
		System.out.println("ENTER THE PIN");
		atms.setState(new SelectingAccount());
	}
	

}
