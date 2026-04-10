package com.example.anime.service;

import com.example.anime.entity.AnimeCharacter;
import com.example.anime.repository.CharacterRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterService {

    private final CharacterRepository repo;
    

    public CharacterService(CharacterRepository repo) {
        this.repo = repo;
    }

    public List<AnimeCharacter> getByAnime(Long animeId) {
        return repo.findByAnimeId(animeId);
    }

    public AnimeCharacter save(AnimeCharacter character) {
        return repo.save(character);
    }
}