package com.correction.model;

public class TransactionProcessor {
	 private NotificationService notificationService;

	    public TransactionProcessor(NotificationService notificationService) {
	        this.notificationService = notificationService;
	    }

	    public void processDeposit(BankAccount account, double amount) {
	        account.deposit(amount);
	        notificationService.sendNotification("Deposited: " + amount);
	    }

	    public void processWithdrawal(BankAccount account, double amount) {
	        try {
	            account.withdraw(amount);
	            notificationService.sendNotification("Withdrawn: " + amount);
	        } catch (IllegalArgumentException e) {
	        	notificationService.sendNotification("Insufficient balance");
	        }
	    }
	}



