package com.model;

public class LEDDisplay implements IObserver {
		private float temperature;
		
		@Override
		public void update(float temperature) {
			this.temperature = temperature;
			System.out.println("LEDdisplay: Temperature update to: " + temperature );
			
		}
		
	}


