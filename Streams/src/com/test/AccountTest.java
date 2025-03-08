package com.test;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.model.Account;



public class AccountTest {

 public static void main(String[] args) {
 

	 Scanner sc = new Scanner(System.in);
	  int numberOfAccount = getPositiveNumber(sc);
	  
	  List<Account> accounts = new ArrayList<Account>(); 
	  
	  for(int i = 0; i < numberOfAccount; i++)
	  {
	   int accountNumber = getUniqueaccountNumber(sc,i,accounts);
	   
	   System.out.println("Enter name of Accoount holder"+(i+1)+" : ");
	   String name = sc.nextLine();
	   
	   double ammount = getPositiveAmount(sc);
	   
	   Account a = new Account(accountNumber,name,ammount);
	   accounts.add(a);
	   System.out.println("Account added");
	  }
	  
	  // Finding min and max balance accounts
	        Account minbalabce = accounts.stream().min(Comparator.comparingDouble(Account::getBalance)).orElse(null);
	        Optional<Account> maxBalanceAccount = accounts.stream().max(Comparator.comparingDouble(Account::getBalance));
	        
	        // Display results
	       // minBalanceAccount.ifPresent(account -> System.out.println("Account with Min Balance: " + account.getBalance()));
	        maxBalanceAccount.ifPresent(account -> System.out.println("Account with Max Balance: " + account.getBalance()));
	        
	        List<Account> s = accounts.stream().filter(i -> i.getName().length() > 6).collect(Collectors.toList());
	        s.forEach(System.out::println);
	        
	        List<Account> demo = accounts.stream().filter(i -> i.getBalance() > 1000).collect(Collectors.toList());
	        demo.forEach(System.out::println);
	      
	        OptionalDouble demo1 = accounts.stream().mapToDouble(i -> i.getBalance()).average();
	        System.out.println(demo1);
	        
	        
	        System.out.println(minbalabce.getBalance());
	        
	        
	        
	        

	        sc.close();
	 
 }

 private static double getPositiveAmount(Scanner sc) {
  double amount;
  while(true)
  {
   System.out.println("Enter balance  : ");
   amount = sc.nextDouble();
   sc.nextLine();
   if(amount > 0 )
   {
    return amount;
   }
   System.out.println("invalid user input try again.");
  }
 }

 private static int getUniqueaccountNumber(Scanner sc,int i, List<Account> accounts) {
  int accNumber;
  while(true)
  {
   System.out.println("Enter account number for account "+(i+1)+" :  ");
   accNumber = sc.nextInt();
   sc.nextLine();
   boolean check  = false;
   
   for(int j = 0; j < i; j++)
   {
    if(accounts.get(j).getAccountNumber() == accNumber)
    {
     check = true;
     break;
    }
   }
   if(!check && accNumber > 0)
   {
    return accNumber;
   }
   System.out.println("Enter a unique and positive account number.");
  }
  
 }

 private static int getPositiveNumber(Scanner sc) {
  int number;
  while(true)
  {
   System.out.println("Enter number of Account : ");
   number = sc.nextInt();
   sc.nextLine();
   if(number > 0 )
   {
    return number;
   }
   System.out.println("invalid user input try again.");
  }
 }

}