package com.model;

public class Book {
	private int bookid;
	private String title;
	private String author;
	private String genre;
	private double price;
	private int yearOfPublication;
	public Book(int bookid, String title, String author, String genre, double price, int yearOfPublication) {
		super();
		this.bookid = bookid;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.price = price;
		this.yearOfPublication = yearOfPublication;
	}
	public int getBookid() {
		return bookid;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getGenre() {
		return genre;
	}
	public double getPrice() {
		return price;
	}
	public int getYearOfPublication() {
		return yearOfPublication;
		
	}
	  @Override
	    public String toString() {
	        return "Book{" +
	                "bookId=" + bookid +
	                ", title='" + title + '\'' +
	                ", author='" + author + '\'' +
	                ", genre='" + genre + '\'' +
	                ", price=" + price +
	                ", yearOfPublication=" + yearOfPublication +
	                '}';
	
	
	  }

}
