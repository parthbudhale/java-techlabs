package com.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.model.Book;

public class LibraryManagementSystem {

 public static void main(String[] args) {
	   
	    
	        List<Book> books = Arrays.asList(
	                new Book(1, "The Great Gatsby", "F. Scott Fitzgerald", "Fiction", 250.0, 1925),
	                new Book(2, "1984", "George Orwell", "Dystopian", 300.0, 1949),
	                new Book(3, "To Kill a Mockingbird", "Harper Lee", "Fiction", 400.0, 1960),
	                new Book(4, "The Hobbit", "J.R.R. Tolkien", "Fantasy", 500.0, 1937),
	                new Book(5, "Harry Potter and the Philosopher's Stone", "J.K. Rowling", "Fantasy", 600.0, 1997),
	                new Book(6, "The Da Vinci Code", "Dan Brown", "Thriller", 350.0, 2003),
	                new Book(7, "The Alchemist", "Paulo Coelho", "Fiction", 450.0, 1988),
	                new Book(8, "Sapiens", "Yuval Noah Harari", "Non-Fiction", 550.0, 2011)
	        );

	       
	        List<Book> booksAfter2010 = books.stream()
	                .filter(book -> book.getYearOfPublication() > 2010)
                .collect(Collectors.toList());
	        System.out.println("Books published after 2010: " + booksAfter2010 + "\n");

	       
	        List<Book> sortedByPrice = books.stream()
	                .sorted(Comparator.comparingDouble(Book::getPrice))
	                .collect(Collectors.toList());
	        System.out.println("Books sorted by price (ascending): " + sortedByPrice + "\n");


	        Map<String, List<Book>> groupedByGenre = books.stream()
	                .collect(Collectors.groupingBy(Book::getGenre));
	        System.out.println("Books grouped by genre: " + groupedByGenre + "\n");

	      
	        Optional<Book> mostExpensiveBook = books.stream()
	                .max(Comparator.comparingDouble(Book::getPrice));
	        mostExpensiveBook.ifPresent(book -> System.out.println("Most expensive book: " + book + "\n"));

	        // 5. Find the total number of books available in the library
	        long totalBooks = books.stream()
	                .count();
	        System.out.println("Total number of books: " + totalBooks + "\n");

	      
	        List<String> uppercaseTitles = books.stream()
	                .map(book -> book.getTitle().toUpperCase())
	                .collect(Collectors.toList());
	        System.out.println("Book titles in uppercase: " + uppercaseTitles + "\n");

	        double totalPrice = books.stream()
	                .mapToDouble(Book::getPrice)
	                .sum();
	        System.out.println("Total price of all books: " + totalPrice + "\n");

	       
	        Optional<Book> oldestBook = books.stream()
	                .min(Comparator.comparingInt(Book::getYearOfPublication));
	        oldestBook.ifPresent(book -> System.out.println("Oldest book: " + book + "\n"));
	    }
	
  
  
  
  
 }


