package com.example.anime.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Anime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String genre;
    private String studio;
    private String imageUrl;

    @OneToMany(mappedBy = "anime", cascade = CascadeType.ALL)
    private List<AnimeCharacter> characters;

    @OneToMany(mappedBy = "anime", cascade = CascadeType.ALL)
    private List<Review> reviews;

    // ✅ GETTERS & SETTERS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public List<AnimeCharacter> getCharacters() {
        return characters;
    }

    public void setCharacters(List<AnimeCharacter> characters) {
        this.characters = characters;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
    public String getImageUrl() {
    return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    }
}