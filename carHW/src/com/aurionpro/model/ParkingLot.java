package com.aurionpro.model;

import java.util.LinkedHashMap;
import java.util.Map;

class ParkingLot {
	 private int capacity;
	    private Map<String, String> parkedCars = new LinkedHashMap<>();

	    public void setCapacity(int capacity) {
	        this.capacity = capacity;
	    }

	    public void parkCar(String carNumber, String ownerName) {
	        if (parkedCars.size() >= capacity) {
	            System.out.println("Parking lot is full.");
	            return;
	        }
	        if (parkedCars.containsKey(carNumber)) {
	            System.out.println("Car already parked.");
	            return;
	        }
	        parkedCars.put(carNumber, ownerName);
	        System.out.println("Car parked: " + carNumber + " - " + ownerName);
	    }

	    public void removeCar(String carNumber) {
	        if (parkedCars.remove(carNumber) != null) {
	            System.out.println("Car removed: " + carNumber);
	        } else {
	            System.out.println("Car not found.");
	        }
	    }

	    public void findCar(String carNumber) {
	        if (parkedCars.containsKey(carNumber)) {
	            System.out.println("Car found: " + carNumber + " - " + parkedCars.get(carNumber));
	        } else {
	            System.out.println("Car not found.");
	        }
	    }

	    public void displayAllCars() {
	        if (parkedCars.isEmpty()) {
	            System.out.println("No cars parked.");
	            return;
	        }
	        System.out.println("All parked cars in order of entry:");
	        for (Map.Entry<String, String> entry : parkedCars.entrySet()) {
	            System.out.println(entry.getKey() + " - " + entry.getValue());
	        }
	    }
	}