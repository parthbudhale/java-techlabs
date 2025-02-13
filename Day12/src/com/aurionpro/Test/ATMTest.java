package com.aurionpro.Test;

import java.util.Scanner;
import com.aurionpro.Model.BankAccount;
import com.aurionpro.Model.InsufficientFundsException;

public class ATMTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of accounts to create: ");
        int numAccounts;

        while (true) {
            if (scanner.hasNextInt()) {
                numAccounts = scanner.nextInt();
                scanner.nextLine(); 
                if (numAccounts > 0) {
                    break;
                } else {
                    System.out.println("Number of accounts must be greater than zero.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); 
            }
        }

        BankAccount[] accounts = new BankAccount[numAccounts];

       
        for (int i = 0; i < numAccounts; i++) {
            System.out.println("\nCreating account " + (i + 1) + ":");

            String accountNumber;
            while (true) {
                System.out.print("Enter your 8-digit account number: ");
                accountNumber = scanner.nextLine();
                
                if (!accountNumber.matches("\\d{8}")) {
                    System.out.println("Invalid account number. It must be exactly 8 digits.");
                    continue;
                }

                boolean isUnique = true;
                for (BankAccount account : accounts) {
                    if (account != null && account.getAccountNumber().equals(accountNumber)) {
                        isUnique = false;
                        break;
                    }
                }

                if (isUnique) {
                    break;
                } else {
                    System.out.println("Account number already exists. Please enter a unique 8-digit account number.");
                }
            }

            double initialBalance;
            while (true) {
                System.out.print("Enter initial balance: ");
                if (scanner.hasNextDouble()) {
                    initialBalance = scanner.nextDouble();
                    scanner.nextLine(); 
                    if (initialBalance >= 0) {
                        break;
                    } else {
                        System.out.println("Initial balance cannot be negative. Try again.");
                    }
                } else {
                    System.out.println("Invalid amount. Please enter a valid number.");
                    scanner.next();
                }
            }

            accounts[i] = new BankAccount(accountNumber, initialBalance);
            System.out.println("Account created successfully!");
        }

       
        while (true) {
            System.out.print("\nEnter your 8-digit account number to access: ");
            String inputAccount = scanner.nextLine();

            BankAccount userAccount = null;
            for (BankAccount account : accounts) {
                if (account.getAccountNumber().equals(inputAccount)) {
                    userAccount = account;
                    break;
                }
            }

            if (userAccount == null) {
                System.out.println("Account not found. Please enter a valid 8-digit account number.");
                continue;
            }

            // ATM Operations
            while (true) {
                System.out.println("\nATM Menu:");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");

                if (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next();
                    continue;
                }

                int choice = scanner.nextInt();
                scanner.nextLine(); 

                try {
                    switch (choice) {
                        case 1:
                            System.out.print("Enter deposit amount: ");
                            if (!scanner.hasNextDouble()) {
                                System.out.println("Invalid amount.");
                                scanner.next();
                                continue;
                            }
                            double depositAmount = scanner.nextDouble();
                            scanner.nextLine();
                            
                            if (depositAmount <= 0) {
                                System.out.println("Deposit amount must be positive.");
                                continue;
                            }

                            userAccount.deposit(depositAmount);
                            break;
                        case 2:
                            System.out.print("Enter withdrawal amount: ");
                            if (!scanner.hasNextDouble()) {
                                System.out.println("Invalid amount.");
                                scanner.next();
                                continue;
                            }
                            double withdrawAmount = scanner.nextDouble();
                            scanner.nextLine();

                            if (withdrawAmount <= 0) {
                                System.out.println("Withdrawal amount must be positive.");
                                continue;
                            }

                            userAccount.withdraw(withdrawAmount);
                            break;
                        case 3:
                            userAccount.checkBalance();
                            break;
                        case 4:
                            System.out.println("Exiting...");
                            scanner.close();
                            return;
                        default:
                            System.out.println("Invalid choice. Try again.");
                    }
                } catch (InsufficientFundsException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
