package com.aurionpro.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ParkingMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ParkingMain lot = new ParkingMain();

        System.out.print("Enter the number of parking slots: ");
        int parkingSlots = scanner.nextInt();
        scanner.nextLine();
        lot.setCapacity(parkingSlots);

        while (true) {
            System.out.println("\nParking System Menu:");
            System.out.println("1. Park a Car");
            System.out.println("2. Remove a Car");
            System.out.println("3. Find a Car");
            System.out.println("4. Display All Cars");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter Car Number: ");
                    String carNumber = scanner.nextLine();
                    System.out.print("Enter Owner Name: ");
                    String ownerName = scanner.nextLine();
                    lot.parkCar(carNumber, ownerName);
                    break;
                case 2:
                    System.out.print("Enter Car Number to Remove: ");
                    String removeCarNumber = scanner.nextLine();
                    lot.removeCar(removeCarNumber);
                    break;
                case 3:
                    System.out.print("Enter Car Number to Find: ");
                    String findCarNumber = scanner.nextLine();
                    lot.findCar(findCarNumber);
                    break;
                case 4:
                    lot.displayAllCars();
                    break;
                case 5:
                    System.out.println("Exiting Parking System.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

	private void displayAllCars() {
		System.out.println();
		
	}

	private void findCar(String findCarNumber) {
		// TODO Auto-generated method stub
		
	}

	private void removeCar(String removeCarNumber) {
		// TODO Auto-generated method stub
		
	}

	private void parkCar(String carNumber, String ownerName) {
		// TODO Auto-generated method stub
		
	}

	private void setCapacity(int parkingSlots) {
		// TODO Auto-generated method stub
		
	}
}