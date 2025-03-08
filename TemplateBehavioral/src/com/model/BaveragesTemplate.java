package com.model;

public abstract class BaveragesTemplate {
	public final void prepareBeverages() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	private void boilWater()
	{
		System.out.println("BoilingWater");
	}
	private void pourInCup()
	{
		System.out.println("pouring into Cup");
	}
	protected abstract void brew();
	protected abstract void addCondiments();
	

}
