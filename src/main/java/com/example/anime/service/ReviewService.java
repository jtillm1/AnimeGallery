package com.example.anime.service;

import com.example.anime.entity.Review;
import com.example.anime.repository.ReviewRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    private final ReviewRepository repo;

    public ReviewService(ReviewRepository repo) {
        this.repo = repo;
    }

    public List<Review> getByAnime(Long animeId) {
        return repo.findByAnimeId(animeId);
    }

    public Review save(Review review) {
        return repo.save(review);
    }
}
