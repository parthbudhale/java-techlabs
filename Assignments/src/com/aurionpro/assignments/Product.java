package com.aurionpro.assignments;

public class Product {
	private int Product;
	private String name;
	private double Price;
	private int stock;
	
	 public Product() {
		 System.out.println("Default constructor");
		 
	 }
	 public Product(int product,String name,double Price,int stock) {       //parameterized
		
		 this.Product=Product;  //this.product is class product= Product(parameter)
		 this.name=name;
		 this.Price=Price;
		 this.stock=stock;
	 }
	 public void setProduct(int Product) {
		 this.Product=Product;
	 }
	 public int getProduct() {
		 return Product;
	 }
	 public void setname(String name) {
		 this.name=name;
	 }
	 public String getname() {
		 return name;
	 }
	 public void setPrice(double Price) {
		 this.Price=Price;
	 }
	 public double getPrice() {
		 return Price;
	 }
	 public void setstock(int stock) {
		 this.stock=stock;
	 }
	 public int getstock() {
		 return stock;
	 }
	 
	 
	 

}
