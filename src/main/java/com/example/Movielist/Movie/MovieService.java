package com.example.Movielist.Movie;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
@Service
public class MovieService {
    private final MovieRepository movieRepository;

    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }
    public List<Movie> getMoviesByGenre(String genre) {
        return movieRepository.findAll().stream()
                .filter(movie -> genre.equals(movie.getGenre()))
                .collect(Collectors.toList());
    }
    public List<Movie> getMoviesByYear(int year) {
        return movieRepository.findAll().stream()
                .filter(movie -> year == movie.getYear())
                .collect(Collectors.toList());
    }
    public List<Movie> getMoviesByRating(Double rating) {
        return movieRepository.findAll().stream()
                .filter(movie -> Objects.equals(rating, movie.getRating()))
                .collect(Collectors.toList());
    }
    public List<Movie> getMoviesByTitle(String title) {
        return movieRepository.findAll().stream()
                .filter(movie -> title.equals(movie.getTitle()))
                .collect(Collectors.toList());
    }
    public List<Movie> getMoviesByWatched(boolean watched) {
        return movieRepository.findAll().stream()
                .filter(movie -> watched == movie.isIswatchted())
                .collect(Collectors.toList());
    }

    public Movie addMovie(Movie movie){
        movieRepository.save(movie);
        return movie;

    }
    @Transactional
    public void deleteMovie(String title) {
        movieRepository.deleteByTitle(title);
    }

    public void iswatched(boolean iswatched, String title) {
        Movie movie = movieRepository.findByTitle(title).get();
        movie.setIswatchted(iswatched);
        movieRepository.save(movie);
    }

}
