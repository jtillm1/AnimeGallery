package com.example.anime.repository;

import com.example.anime.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByAnimeId(Long animeId);
}