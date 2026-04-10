package com.example.anime.repository;

import com.example.anime.entity.AnimeCharacter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CharacterRepository extends JpaRepository<AnimeCharacter, Long> {
    List<AnimeCharacter> findByAnimeId(Long animeId);
}