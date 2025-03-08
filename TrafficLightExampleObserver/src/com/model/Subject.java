package com.model;

public interface Subject {
	
	void addVehicle(ObserverVehicle vehicle);
	
	void removeVehicle(ObserverVehicle vehicle);
	
	void notifyObserver();
}
