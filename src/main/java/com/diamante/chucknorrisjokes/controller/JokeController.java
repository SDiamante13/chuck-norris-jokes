package com.diamante.chucknorrisjokes.controller;

import com.diamante.chucknorrisjokes.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokeController {

    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping("/")
    String getRandomChuckNorrisJoke(Model model) {
        model.addAttribute("joke", jokeService.getRandomJoke());
        return "chucknorris";
    }
}
