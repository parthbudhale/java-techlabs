package com.aurionpro.Test;

import com.aurionpro.Model.Bike;
import com.aurionpro.Model.Car;
import com.aurionpro.Model.IVehicle;
import java.util.Scanner;

public class VehicleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ContinueTesting=true;
        while(ContinueTesting) {
        System.out.println("Select Vehicle: 1. Car  2. Bike");
        int choice = scanner.nextInt();
        
        IVehicle vehicle = null;
        
        switch (choice) {
            case 1:
                vehicle = new Car();
                break;
            case 2:
                vehicle = new Bike();
                break;
            default:
                System.out.println("Invalid choice. Exiting.");
                scanner.close();
                return;
        }
        
        vehicle.start();
        System.out.println("Fuel Type: " + vehicle.fuelType());
        vehicle.stop();
        }
        scanner.close();
    }
}

