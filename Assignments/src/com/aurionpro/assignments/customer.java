package com.aurionpro.assignments;

public class customer {
	public static void main(String[] args) {
		Product product1 = new Product(1,"battery",25,20);
		Product product2 = new Product(2,"Shirt",150,10);
		Product product3 = new Product(3,"Ice cream",90,30);
		
		ShoppingCart shoppingCart = new ShoppingCart();
		shoppingCart.Products.add(product1);
		shoppingCart.Products.add(product2);
		shoppingCart.Products.add(product3);
		
		shoppingCart.RemoveProduct(product2);
		
		System.out.println("Total Amount for this cart is: "+shoppingCart.CalculateTotal());
		
	}

}
