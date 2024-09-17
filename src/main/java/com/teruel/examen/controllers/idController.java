package com.teruel.examen.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.teruel.examen.services.generatorService;

@RestController
@RequestMapping("/id")
public class idController {
	
	@Autowired
	generatorService generator = new generatorService();
	
	@GetMapping({"", "/"})
	public void welcome() {
		System.out.println("hola :3");
	}
	
	@GetMapping("/lista")
	public String compareIdLista(
			@RequestParam int id
			) {
		ArrayList<Integer> lista = generator.generador();
		Boolean contiene = lista.contains(id);
		
		System.out.println(lista);
		System.out.println("id ingresado por URL: " + id);
		System.out.println("\n contiene:" + contiene.toString());
		
		return lista + "<br>ID ingresado por url: " + id + "<br>existe: " + contiene;

	}
	
}
