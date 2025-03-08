package com.test;

import java.util.Scanner;

import com.model.MenuCategory;
import com.model.MenuItem;

public class MenuTest {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenuCategory mainMenu = new MenuCategory("Main Menu");

        while (true) {
            int choice = getValidChoice(scanner); 

            switch (choice) {
                case 1:
                    System.out.print("Enter category name: ");
                    String categoryName = scanner.nextLine().trim();
                    mainMenu.add(new MenuCategory(categoryName));
                    System.out.println("Category '" + categoryName + "' added successfully!");
                    break;

                case 2:
                    System.out.print("Enter item name: ");
                    String itemName = scanner.nextLine().trim();
                    mainMenu.add(new MenuItem(itemName));
                    System.out.println("Item '" + itemName + "' added successfully!");
                    break;

                case 3:
                    System.out.println("\n--- Menu Structure ---");
                    mainMenu.showDetails(0);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
            }
        }
    }

    // valid choice from the user
    private static int getValidChoice(Scanner scanner) {
        int choice;
        while (true) {
            try {
                System.out.println("\nChoose an option:");
                System.out.println("1. Add a Menu Category");
                System.out.println("2. Add a Menu Item");
                System.out.println("3. Show Menu");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = Integer.parseInt(scanner.nextLine().trim());

                if (choice >= 1 && choice <= 4) {
                    return choice;
                } else {
                    System.out.println("Invalid input! Please enter a number between 1 and 4.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a numeric value.");
            }
        }
    }
	}