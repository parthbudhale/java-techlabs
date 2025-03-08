package com.test;

import com.model.Internet;
import com.model.ProxyInternet;

public class ProxyTest {
	public static void main(String[] args) {
		Internet internet =new ProxyInternet();
		
		try {
			internet.connectTo ("google.com");
			internet.connectTo ("wiki.com");
			internet.connectTo ("facebook.com");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
