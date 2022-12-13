package com.robert.manytomany.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.robert.manytomany.models.Game;
import com.robert.manytomany.services.GameService;

@Controller
@RequestMapping("/games")
public class GameController {
	
	private final GameService gameServ;
	public GameController(GameService gameServ) {
		this.gameServ = gameServ;
	}
	
	@GetMapping("/create")
	public String createGame(@ModelAttribute("game") Game game) {
		return "game/create.jsp";
	}
	
	@PostMapping("/create")
	public String processCreateGame(@Valid @ModelAttribute("game") Game game, BindingResult result) {
		if(result.hasErrors()) {
			return "game/create.jsp";
		}
		gameServ.createGameWithGenre(game);
		return "redirect:/";
	}
}
