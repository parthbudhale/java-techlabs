package com.aurionpro;

import java.util.List;
import java.util.Scanner;
//public class MovieController {
//	 public MovieManager manager;
//	 Scanner scanner = new Scanner(System.in);
//	 public MovieController()
//	 {
//	  manager=new MovieManager();
//	 }
//	 public void start()
//	 {
//	  while(true) {
//	   displayMenu();
//	   int choice=scanner.nextInt();
//	    switch (choice) { 
//	             case 1: 
//	              displayMovies(); 
//	              break; 
//	             case 2: 
//	              addMovie(); 
//	              break; 
//	             case 3: 
//	              manager.clearMovies(); 
//	              System.out.println("All movies cleared."); break; 
//	             case 4: 
//	              System.out.println("Exit the App");
//	              return; 
//	             default: 
//	              System.out.println("Invalid choice."); 
//	         } 
//	  }
//	 }
//	 private void addMovie() {
//	  System.out.println("Enter movie ID: ");
//	  int id = scanner.nextInt();
//	  scanner.nextLine();
//	  System.out.println("Enter movie name");
//	  String name = scanner.nextLine();
//	  System.out.println("Enter movie year");
//	  int year = scanner.nextInt();
//	  scanner.nextLine();
//	  System.out.println("Enter movie genre");
//	  String genre = scanner.nextLine();
//	  try {
//	   manager.addMovie(new Movie(id,name,year,genre));
//	   System.out.println("Movie added successfully");
//	  } catch (CapacityFullException e) {
//	   // TODO Auto-generated catch block
//	   e.printStackTrace();
//	  }
//	  
//	 }
//	 private void displayMovies() {
//	  List<Movie> movie = manager.getMovies();
//	  if(movie.isEmpty()) {
//	   System.out.println("No movies");
//	  }else {
//	   for(Movie movies:movie) {
//	    System.out.println(movies);
//	   }
//	  }
//	  
//	 }
//	 public void displayMenu()
//	 {
//	  System.out.println("1. Display Movies");
//	  System.out.println("2. Add Movies");
//	  System.out.println("3. Clear all Movies");
//	  System.out.println("4. Exit");
//	 }
//
//	 
//	}

public class MovieController {
	private MovieManager manager;
	private Scanner scanner;

	public MovieController() {
		manager = new MovieManager();
		scanner = new Scanner(System.in);
	}

	public void start() {
		displayMenu();
	}

	private void displayMenu() {
		while (true) {
			System.out.println("\nMovie Store Menu:");
			System.out.println("1. Display Movies");
			System.out.println("2. Add Movie");
			System.out.println("3. Clear All Movies");
			System.out.println("4. Exit");

			System.out.print("Enter choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				displayMovies();
				break;
			case 2:
				setMovieDetails();
				break;
			case 3:
				manager.clearMovies();
				break;
			case 4: 
				System.out.println("Exiting... Movies are saved.");
				return;
				
				
				
			
			default:
				System.out.println("Invalid choice! Try again.");
				break;
			}
		}
	}

	private void displayMovies() {
		if (manager.getMovies().isEmpty()) {
			System.out.println("No movies found.");
		} else {
			for (Movie movie : manager.getMovies()) {
				System.out.println(movie);
			}
		}
	}

	private void setMovieDetails() {
		try {
			System.out.print("Enter movie name: ");
			String name = scanner.nextLine();

			System.out.print("Enter release year: ");
			int year = scanner.nextInt();
			scanner.nextLine();

			System.out.print("Enter genre: ");
			String genre = scanner.nextLine();

			Movie movie = new Movie(manager.getMovieId(), name, year, genre);
			manager.addMovie(movie);
			System.out.println("Movie added successfully!");

		} catch (CapacityFullException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	private void displayMovies1() {
		if (manager.getMovies().isEmpty()) {
			System.out.println("No movies found.");
		} else {
			for (Movie movie : manager.getMovies()) {
				System.out.println(movie);
			}
		}
	}

	private void setMovieDetails1() {
		try {
			System.out.print("Enter movie name: ");
			String name = scanner.nextLine();
			System.out.print("Enter release year: ");
			int year = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Enter genre: ");
			String genre = scanner.nextLine();
			Movie movie = new Movie(manager.getMovieId(), name, year, genre);
			manager.addMovie(movie);
			System.out.println("Movie added successfully!");
		} catch (CapacityFullException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}

