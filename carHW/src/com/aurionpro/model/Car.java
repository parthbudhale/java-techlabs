package com.aurionpro.model;
import java.time.LocalTime;
import java.util.LinkedHashMap;
import java.util.Map;

class Car {
    private String carNumber;
    private String ownerName;
    private LocalTime entryTime;

    public Car(String carNumber, String ownerName) {
        if (carNumber == null || carNumber.isEmpty() || ownerName == null || ownerName.isEmpty()) {
            throw new IllegalArgumentException("Car number and owner name cannot be empty.");
        }
        this.carNumber = carNumber;
        this.ownerName = ownerName;
        this.entryTime = LocalTime.now();
    }

    public String getCarNumber() {
        return carNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public LocalTime getEntryTime() {
        return entryTime;
    }

    @Override
    public String toString() {
        return "Car{carNumber='" + carNumber + "', ownerName='" + ownerName + "', entryTime=" + entryTime + "}";
    }
}