package com.example.Movielist.Movie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {

    void deleteByTitle(String title);
    Optional<Movie> findByTitle(String title);
}
