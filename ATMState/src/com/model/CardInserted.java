package com.model;

public class CardInserted implements ATMState {

	@Override
	public void HandleRequest(ATM atms) {
		// TODO Auto-generated method stub
		System.out.println("PLEASE INSERT THE CARD");
		
		atms.setState(new EnteringPin());
		
	}

}
