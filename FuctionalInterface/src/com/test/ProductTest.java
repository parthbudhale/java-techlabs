package com.test;

import java.util.Scanner;
import java.util.function.Consumer;

import com.model.Product;

public class ProductTest {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  int numberOfProduct = getPositiveNumber(sc);
		  
		  Product[] products = new Product[numberOfProduct];
		  
		  for(int i = 0; i < numberOfProduct; i++)
		  {
		   System.out.println("Enter name of product "+(i+1)+" : ");
		   String name = sc.nextLine();
		   
		   double price = getPositiveDouble(sc,i);
		  
		   System.out.println(name +" is available or not True/false : ");
		   boolean available = sc.nextBoolean();
		   
		   products[i] = new Product(name,price,available);
		   System.out.println("Product added !!");
		  }
		  
		  Consumer<Product> printDetails = p -> 
		  {
		   System.out.println("Name of the product : "+p.getName());
		   System.out.println("Price of the product : "+p.getPrice());
		   System.out.println();
		  };
		  
		  for(int i = 0; i < numberOfProduct; i++)
		  {
		   printDetails.accept(products[i]);
		  }
		 }
		 
		 
		 
		 private static int getPositiveNumber(Scanner sc) 
		 {
		  int number;
		  while(true)
		  {
		   System.out.println("Enter number of products : ");
		   number = sc.nextInt();
		   sc.nextLine();
		   if(number > 0 )
		   {
		    return number;
		   }
		   System.out.println("invalid user input try again.");
		  }
		 }
		 
		 private static double getPositiveDouble(Scanner sc, int i) {
		  double number;
		  while(true)
		  {
		   System.out.println("Enter price of product "+(i+1)+" :");
		   number = sc.nextInt();
		   sc.nextLine();
		   if(number >= 0 )
		   {
		    return number;
		   }
		   System.out.println("price must be positive .");
		  }
		    }

		}


