package com.aurionproTest;

import com.aurionpromodel.Movie;

public class ToStringMethod {
	public static void main(String[] args) {
		Movie movie = new Movie(1,"Parth",2002,"Action");
		
		movie.toString();
		System.out.println(movie.toString());
		
	}

}
