package com.model;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
	
	private RealInternet RL = new RealInternet();
	private static List<String>blockedSites = new ArrayList<>();
	
	static {
		blockedSites.add("facebook.com");
		blockedSites.add("youtube.com");
		blockedSites.add("insta.com");
	
	}
	@Override
	public void connectTo(String serverHost) throws Exception {
		if(blockedSites.contains(serverHost.toLowerCase())) {
			throw new Exception("Access Denied to"+serverHost);
		}
		RL.connectTo(serverHost);
		
	}
	

}
