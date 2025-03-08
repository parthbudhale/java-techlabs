package com.test;

import com.model.EmailDisplay;
import com.model.LEDDisplay;
import com.model.PhoneDisplay;
import com.model.WeatherStation;

public class IObserverMain {
	public static void main(String[] args) {
		WeatherStation weatherStation = new WeatherStation();
		PhoneDisplay phoneDisplay = new PhoneDisplay();
		LEDDisplay ledDisplay = new LEDDisplay();
		EmailDisplay emailDisplay = new EmailDisplay();

		weatherStation.registerObserver(ledDisplay);
		weatherStation.registerObserver(phoneDisplay);
		weatherStation.registerObserver(emailDisplay);
		
		weatherStation.setTemperature(27);
		weatherStation.setTemperature(30);
		
		weatherStation.removveObserver(ledDisplay);
		weatherStation.setTemperature(40);
	}
}
