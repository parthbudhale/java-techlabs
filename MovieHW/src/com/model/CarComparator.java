package com.model;

import java.util.Comparator;

class CarComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        return Double.compare(m2.getRating(), m1.getRating()); // Descending order
    }
}
