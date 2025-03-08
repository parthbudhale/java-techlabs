package com.test;

import com.model.TrafficSignal;
import com.model.VehicleBike;
import com.model.VehicleBus;
import com.model.VehicleCar;

public class TrafficSignalTest {

	public static void main(String[] args) {
		VehicleCar car = new VehicleCar();
		VehicleBike bike = new VehicleBike();
		VehicleBus bus = new VehicleBus();
		
		TrafficSignal signal = new TrafficSignal();
		
		signal.addVehicle(car);
		signal.addVehicle(bike);
		signal.addVehicle(bus);
		
		signal.changeLight("Red");
		signal.changeLight("Green");
	}

}
