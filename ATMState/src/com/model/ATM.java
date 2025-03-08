package com.model;

public class ATM {
	private ATMState atms;
	public ATM()
	{
		atms = new NoCardInserted();
	}
	public void setState(ATMState atms)
	{
		this.atms=atms;
	}
	public void changestate()
	{
		atms.HandleRequest(this);
	}

}
