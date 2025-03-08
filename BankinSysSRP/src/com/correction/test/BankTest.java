package com.correction.test;

import com.correction.model.BankAccount;
import com.correction.model.NotificationService;
import com.correction.model.TransactionProcessor;

public class BankTest {
	    public static void main(String[] args) {
	        BankAccount account = new BankAccount("12345", 1000);
	        NotificationService notificationService = new NotificationService();
	        TransactionProcessor processor = new TransactionProcessor(notificationService);
	        
	        processor.processDeposit(account, 500);
	        processor.processWithdrawal(account, 200);
	        processor.processWithdrawal(account, 2000);
	    }
	}

