package com.model;

public class Product {
	 private String name;
	 private double price;
	 private boolean isAvailable;
	 
	 public Product(String name, double price,boolean isAvailable) {
	  this.name = name;
	  this.price = price;
	  this.isAvailable = isAvailable;
	 }
	 
	 public String getName()
	 {
	  return name;
	 }
	 
	 public double getPrice()
	 {
	  return price;
	 }
	 
	}

