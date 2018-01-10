package com.qa.main;

import com.qa.model.Movie;
import com.qa.service.Service;

public class Main {

	public static void main(String[] args) {
		Service service = new Service();
		Movie rambo = new Movie("rambo", "action", "15");
		Movie harryPotter = new Movie("harrypotter", "fantasy", "12");
		Movie it = new Movie("it", "horror", "18");
		Movie carrie = new Movie("carrie", "horror", "18");
		service.addMovie(rambo);
		service.addMovie(harryPotter);
		service.addMovie(it);
		service.addMovie(carrie);
		int count = service.findMovieByGenre("horror");
		System.out.println("The value of count is " + count);
	}

}
