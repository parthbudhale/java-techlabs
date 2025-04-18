package com.aurionpro;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MovieManager {
    private List<Movie> movies;
    private static final int MAX_CAPACITY = 5;
    private static final String FILE_PATH = "C:\\Users\\parth.budhale\\Desktop\\Aurionpro_training\\MovieManager\\src\\MovieData\\data.txt";

    public MovieManager() {
        movies = new ArrayList<>();
        loadMovies();
    }

    public void addMovie(Movie movie) throws CapacityFullException {
        if (movies.size() >= MAX_CAPACITY) {
            throw new CapacityFullException("Movie list is full! Cannot add more movies.");
        }
        movies.add(movie);
        saveMovies();
    }

    public void clearMovies() {
        movies.clear();
        saveMovies();
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public int getMovieId() {
        return movies.size() + 1;
    }

    private void loadMovies() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            movies = (List<Movie>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("No previous movie data found. Starting fresh.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void saveMovies() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(movies);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteAllMovies() {
        movies.clear();
        saveMovies();
    }
}
