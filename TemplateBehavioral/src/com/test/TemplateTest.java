package com.test;

import com.model.BaveragesTemplate;
import com.model.Coffee;
import com.model.Tea;

public class TemplateTest {
	public static void main(String[] args) {
		System.out.println("Preparing Tea");
		BaveragesTemplate tea = new Tea();
		tea.prepareBeverages();
		
		System.out.println("......................");
		
		System.out.println("Preparing Coffee");
		BaveragesTemplate Coffee = new Coffee ();
		Coffee.prepareBeverages();
		
	}

}
