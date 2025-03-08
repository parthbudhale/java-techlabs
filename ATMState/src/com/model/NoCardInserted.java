package com.model;

public class NoCardInserted implements ATMState {

	@Override
	public void HandleRequest(ATM atms) {
		// TODO Auto-generated method stub
		System.out.println("NO CARD IS INSERTED.PLZ INSERT THE CARD");
		
		atms.setState(new CardInserted());
		
	}

}
