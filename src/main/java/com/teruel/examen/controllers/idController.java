package com.teruel.examen.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.teruel.examen.services.generatorService;

@Controller
@RequestMapping("/id")
public class idController {
	
	generatorService generator = new generatorService();
	
	@GetMapping({"", "/"})
	public void welcome() {
		System.out.println("hola :3");
	}
	
	@GetMapping("/lista")
	public void compareIdLista(
			@RequestParam int id
			) {
		ArrayList<Integer> lista = generator.generador();
		Boolean contiene = lista.contains(id);
		
		System.out.println(lista);
		System.out.println("id ingresado por URL: " + id);
		System.out.println("\n contiene:" + contiene.toString());

	}
	
}
