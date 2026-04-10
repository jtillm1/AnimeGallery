package com.example.anime.service;

import com.example.anime.entity.Anime;
import com.example.anime.repository.AnimeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService {

    private final AnimeRepository repo;

    public AnimeService(AnimeRepository repo) {
        this.repo = repo;
    }

    public List<Anime> getAll() {
        return repo.findAll();
    }

    public Anime getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Anime save(Anime anime) {
        return repo.save(anime);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}