package com.teruel.examen.services;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class generatorService {

	private ArrayList<Integer> lista = new ArrayList();
	
	public ArrayList<Integer> generador() {
		lista.clear();
		Random rnd = new Random();
		
		for(int i = 0; i < 5; i++) {
			this.lista.add(rnd.nextInt(0, 11));
		}
		
		return lista;
	}

	public ArrayList<Integer> getIds() {
		return lista;
	}
	
	
}
