package com.example.anime.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.anime.entity.Anime;
import com.example.anime.service.AnimeService;
import com.example.anime.service.CharacterService;
import com.example.anime.entity.AnimeCharacter; 

@Controller
public class AnimeViewController {

    private final AnimeService service;
    private final CharacterService characterService;

    public AnimeViewController(AnimeService service, CharacterService characterService) {
        this.service = service;
        this.characterService = characterService;
    }

    @GetMapping("/anime")
    public String list(Model model) {
        model.addAttribute("animeList", service.getAll());
        return "anime-list";
    }

    @GetMapping("/anime/{id}")
    public String details(@PathVariable Long id, Model model) {
        model.addAttribute("anime", service.getById(id));
        return "anime-details";
    }

    @GetMapping("/anime/create")
    public String createForm() {
        return "anime-create";
    }

    @PostMapping("/anime/create")
    public String create(Anime anime) {
        service.save(anime);
        return "redirect:/anime";
    }

    @GetMapping("/anime/update/{id}")
    public String updateForm(@PathVariable Long id, Model model) {
        model.addAttribute("anime", service.getById(id));
        return "anime-update";
    }

    @PostMapping("/anime/update/{id}")
    public String update(@PathVariable Long id, Anime anime) {
        service.save(anime);
        return "redirect:/anime/" + id;
    }

    @GetMapping("/anime/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/anime";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @PostMapping("/anime/{id}/character/add")
    public String addCharacter(@PathVariable Long id,
                           @RequestParam String name,
                           @RequestParam String role) {

    Anime anime = service.getById(id);

    AnimeCharacter character = new AnimeCharacter();
    character.setName(name);
    character.setRole(role);

    
    character.setAnime(anime);

    characterService.save(character);

    return "redirect:/anime/" + id;
}
}