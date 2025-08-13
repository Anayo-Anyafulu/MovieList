package com.example.Movielist.Movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="/api/v1/movie")
public class MovieController {
    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public List<Movie> getMoviies(
            @RequestParam(required = false) String title,
            @RequestParam(required = false) String genre,
            @RequestParam(required = false) Integer year,
            @RequestParam(required = false) Boolean iswatched) {
        if (title != null) {
            return movieService.getMoviesByTitle(title);
        }
        else if (year != null) {
            return movieService.getMoviesByYear(year);
        }
        else if (genre != null) {
            return movieService.getMoviesByGenre(genre);
        }
        else if (iswatched != null) {
            return movieService.getMoviesByWatched(iswatched);
        }
        else {
            return movieService.getAllMovies();
        }
    }
    @PostMapping
    public ResponseEntity<Movie> addNewMovie(@RequestBody Movie movie) {
        Movie addedMovie = movieService.addMovie(movie);
        return new ResponseEntity<>(addedMovie, HttpStatus.CREATED);
    }
    @PutMapping
    public ResponseEntity<Movie> updateMovie(@RequestBody Movie movie) {
        Movie updatedMovie = movieService.addMovie(movie);
        return new ResponseEntity<>(updatedMovie, HttpStatus.OK);
    }
    @DeleteMapping("/{title}")
    public ResponseEntity<String> deleteMovie(@PathVariable("title") String title) {
        movieService.deleteMovie(title);
        return new ResponseEntity<>("Movie deleted", HttpStatus.OK);
    }



}
