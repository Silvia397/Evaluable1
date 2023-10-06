package com.example.proyectoEvaluable1.web.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.proyectoEvaluable1.web.app.model.Asignatura;

@Controller
public class AsignaturaController {
	
	@GetMapping ("/con-numero")
	public String m1 (Model model) {
		model.addAttribute("lista", Asignatura.dameLaListaDeAsignaturas());
		return "listado-con-alumnos";
		
	}

}
