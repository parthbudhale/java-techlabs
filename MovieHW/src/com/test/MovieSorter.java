package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MovieSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Movie> movies = new ArrayList<>();

        System.out.print("Enter the number of movies: ");
        int numMovies = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numMovies; i++) {
            System.out.println("Enter details for Movie " + i + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Title: ");
            String title = scanner.nextLine();
            
            double rating;
            while (true) {
                System.out.print("Rating (0.0 - 10.0): ");
                rating = scanner.nextDouble();
                scanner.nextLine();
                if (rating >= 0.0 && rating <= 10.0) {
                    break;
                }
                System.out.println("Invalid rating. Please enter a value between 0.0 and 10.0.");
            }

            movies.add(new Movie(id, title, rating));
        }

        System.out.println("\nMovies sorted by Title:");
        Collections.sort(movies);
        movies.forEach(System.out::println);

        System.out.println("\nMovies sorted by Rating:");
        movies.sort(new CarComparator());
        movies.forEach(System.out::println);

        scanner.close();
    }
}
