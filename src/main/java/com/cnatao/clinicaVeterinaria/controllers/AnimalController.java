package com.cnatao.clinicaVeterinaria.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cnatao.clinicaVeterinaria.entities.Animal;
import com.cnatao.clinicaVeterinaria.services.AnimalService;

@RestController
@RequestMapping(value = "/animal")
public class AnimalController {
	
	@Autowired
	private AnimalService service;
	
	// MÉTODO PARA CRIAR LISTA DE ANIMAIS 
	
	@GetMapping
	public ResponseEntity<List<Animal>> ListaAnimal() {
		List<Animal> lista = service.ListaAnimal();
		return ResponseEntity.status(HttpStatus.OK).body(lista);
	}
	
	
	
	// MÉTODO PARA BUSCAR ANIMAL POR ID
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Animal> ProcurarPorId(@PathVariable Integer id) {
		Animal animal = service.ProcurarPorId(id);
		return ResponseEntity.status(HttpStatus.OK).body(animal);	
	}
	
	// MÉTODO PARA ADICIONAR ANIMAL
	
	@PostMapping
	public ResponseEntity<String> AdicionarAnimal(@RequestBody Animal animal ) {
		String adicionar = service.AdicionarAnimal(animal);
		return ResponseEntity.status(HttpStatus.CREATED).body(adicionar);	
	}
	
	// MÉTODO PARA ATUALIZAR DADOS DO ANIMAL(EDITAR)
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<String> EditarAnimal(@PathVariable Integer id, @RequestBody Animal animal) {
		String editar = service.EditarAnimal(id, animal);
		return ResponseEntity.status(200).body(editar);
	}
	
	
	// MÉTODO PARA EXCLUIR ANIMAL
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> ExcluirAnimal(@PathVariable Integer id) {
		service.ExcluirAnimal(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}	
	

}
