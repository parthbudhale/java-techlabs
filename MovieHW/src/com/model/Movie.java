package com.model;
import java.util.*;

	class Movie implements Comparable<Movie> {
	    private int id;
	    private String title;
	    private double rating;

	    public Movie(int id, String title, double rating) {
	        this.id = id;
	        this.title = title;
	        this.rating = rating;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public double getRating() {
	        return rating;
	    }

	    @Override
	    public int compareTo(Movie other) {
	        return this.title.compareTo(other.title);
	    }

	    @Override
	    public String toString() {
	        return "Movie [ID=" + id + ", Title=" + title + ", Rating=" + rating + "]";
	    }
	}



