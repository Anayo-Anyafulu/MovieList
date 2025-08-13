package com.example.Movielist.Movie;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @Column(name = "id", unique = true)
    private int id;
    private String title;
    private int year;
    private Double rating;
    private String genre;
    private boolean Iswatchted;
    private String notes;

    public Movie(int id, String title, int year, boolean Iswatchted, String genre, Double rating, String notes) {
        this.title = title;
        this.year = year;
        this.Iswatchted = Iswatchted;
        this.genre = genre;
        this.rating = rating;
        this.notes = notes;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public boolean isIswatchted() {
        return Iswatchted;
    }

    public String getGenre() {
        return genre;
    }
    public Double getRating() {
        return rating;
    }
    public void setRating(Double rating) {
        this.rating = rating;
    }
    public String getNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setIswatchted(boolean Iswatchted) {
        this.Iswatchted = Iswatchted;
    }
    public Movie(){

    }
    public Movie(String title, boolean Iswatchted, String notes) {
        this.title = title;
        this.year = year;
        this.Iswatchted = Iswatchted;
        this.genre = genre;
        this.rating = rating;
        this.notes = notes;
    }
}
