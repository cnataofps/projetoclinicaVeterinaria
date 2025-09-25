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
import com.cnatao.clinicaVeterinaria.entities.Consulta;
import com.cnatao.clinicaVeterinaria.services.ConsultaService;

@RestController
@RequestMapping(value = "/consulta")
public class ConsultaController {
	
	@Autowired
	private ConsultaService service;
	
	// MÉTODO PARA CRIAR LISTA DE CONSULTAS
	
	@GetMapping
	public ResponseEntity<List<Consulta>> ListaConsulta() {
		List <Consulta> lista = service.ListaConsulta();
		return ResponseEntity.status(HttpStatus.OK).body(lista);
	}
	
	
	// MÉTODO PARA BUSCAR CONSULTA POR ID
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Consulta> BuscarConsultaPorId(@PathVariable Integer id) {
		Consulta consulta = service.BuscarConsultaPorId(id);
		return ResponseEntity.status(HttpStatus.OK).body(consulta);	
	}
	
	
	// MÉTODO PARA ADICIONAR CONSULTA
	
	@PostMapping
	public ResponseEntity<String> AdicionarConsulta(@RequestBody Consulta consulta ) {
		String adicionar = service.AdicionarConsulta(consulta);
		return ResponseEntity.status(HttpStatus.CREATED).body(adicionar);	
	}
	
	// MÉTODO PARA ATUALIZAR DADOS DA CONSULTA(EDITAR)
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<String> EditarConsulta(@PathVariable Integer id, @RequestBody Consulta consulta) {
		String editar = service.EditarConsulta(id, consulta);
		return ResponseEntity.status(200).body(editar);
	}
	
	
	// MÉTODO PARA EXCLUIR ANIMAL
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> ExcluirConsulta(@PathVariable Integer id) {
		service.ExcluirConsulta(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
	

}