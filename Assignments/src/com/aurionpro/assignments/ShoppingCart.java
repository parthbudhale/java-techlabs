package com.aurionpro.assignments;

import java.util.ArrayList;

public class ShoppingCart {
	public ShoppingCart() {
		System.out.println("Default Constructor");
	}

	ArrayList Products = new ArrayList<Product>(); // syntax of ArrayList

	public void addProduct(Product P) { // creating method
		Products.add(P);
	}

	public void RemoveProduct(Product P) {
		Products.remove(P);
	}

	public double CalculateTotal() {
		double Totalamount = 0.0;
		for (int i = 0; i < Products.size(); i++) {
			Product P = (Product) Products.get(i);
			Totalamount += (P.getPrice() * P.getstock());

		}
		return Totalamount;
	}

}
