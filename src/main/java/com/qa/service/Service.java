package com.qa.service;

import java.util.HashMap;
import java.util.Map;

import com.qa.model.Movie;

public class Service {
	private Map<Integer, Movie> movieMap;
	private static int count = 0;

	public Service() {
		movieMap = new HashMap<Integer, Movie>();
	}

	public void addMovie(Movie aMovie) {
		count++;
		movieMap.put(count, aMovie);
	}

	public void deleteMovie(int movieToDelete) {
		movieMap.remove(movieToDelete);
	}

	public int findMovieByGenre(String genre) {
		return (int) movieMap.values().stream().filter(a -> a.getGenre().equals(genre)).count();
	}

}
