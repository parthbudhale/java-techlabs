package com.model;
public interface ISubjects {

	void registerObserver(IObserver observer);
	void removveObserver(IObserver observer);
	void notifyObserver();
	
}