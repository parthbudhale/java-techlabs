package com.model;
import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements ISubjects {

	private float temperature;
	private List<IObserver> observers;

	public WeatherStation() {
		observers = new ArrayList<>();
	}

	@Override
	public void registerObserver(IObserver observer) {
		observers.add(observer);

	}

	@Override
	public void removveObserver(IObserver observer) {
		observers.remove(observer);

	}

	@Override
	public void notifyObserver() {
		for (IObserver observer : observers) {
			observer.update(temperature);
		}

	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
		System.out.println("\nWeatherStation new temperature is: "+ temperature);
		notifyObserver();
	}

}
