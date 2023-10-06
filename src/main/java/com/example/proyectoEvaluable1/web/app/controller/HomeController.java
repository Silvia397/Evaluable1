package com.example.proyectoEvaluable1.web.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
		
		@GetMapping ({"/", "/home", "/home/", ""})
		public String HomeHandler (Model model) {
			model.addAttribute ("titular", "Inicio");
			model.addAttribute ("titulo", "Esta es la página de inicio");
				                return "home";
		}

}
