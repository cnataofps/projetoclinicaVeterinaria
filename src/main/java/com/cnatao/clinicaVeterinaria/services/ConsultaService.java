package com.cnatao.clinicaVeterinaria.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cnatao.clinicaVeterinaria.entities.Animal;
import com.cnatao.clinicaVeterinaria.entities.Consulta;
import com.cnatao.clinicaVeterinaria.repository.AnimalRepository;
import com.cnatao.clinicaVeterinaria.repository.ConsultaRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class ConsultaService {
	
	@Autowired
	private AnimalRepository animalRepository;
	
	@Autowired
	private ConsultaRepository repository;
	
	// MÉTODO PARA LISTAR TODOS AS CONSULTAS
	
	public List<Consulta> ListaConsulta() {
		return repository.findAll();
		
	}
	
	// MÉTODO PARA BUSCAR CONSULTA POR ID
	
	public Consulta BuscarConsultaPorId(Integer id) {
		return repository.findById(id).get();
		
	}
	
	// MÉTODO PARA ADICIONAR CONSULTA
	
	public String AdicionarConsulta(Consulta consulta) {
	    if (consulta.getAnimal() == null || consulta.getAnimal().getId() == null) {
	        throw new IllegalArgumentException("Consulta precisa estar vinculada a um animal");
	    }

	    Animal animal = animalRepository.findById(consulta.getAnimal().getId())
	        .orElseThrow(() -> new RuntimeException("Animal não encontrado"));

	    consulta.setAnimal(animal);
	    repository.save(consulta);
	    return "Consulta cadastrada com sucesso!";
	}
	
	
	// MÉTODO PARA ATUALIZAR DADOS DA CONSULTA(EDITAR)
	
	public String EditarConsulta(Integer id, Consulta consulta) {
		Consulta controle = repository.findById(id).get();
		controle.setData(consulta.getData());
		controle.setDiagnostico(consulta.getDiagnostico());
		controle.setTratamento(consulta.getTratamento());
				
		repository.save(controle);
		return "Consulta editado com sucesso!";
		
	}
	
	// MÉTODO PARA EXCLUIR CONSULTA
	
	public String ExcluirConsulta(Integer id) {
		
		Consulta controle = repository.findById(id).get();
		repository.delete(controle);
		return "Consulta excluido com sucesso!";
	}
	
}


