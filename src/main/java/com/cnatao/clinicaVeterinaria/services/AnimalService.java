package com.cnatao.clinicaVeterinaria.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cnatao.clinicaVeterinaria.entities.Animal;
import com.cnatao.clinicaVeterinaria.repository.AnimalRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class AnimalService {
	
	@Autowired
	private AnimalRepository repository;
	
	// MÉTODO PARA LISTAR TODOS OS ANIMAIS
	
	public List<Animal> ListaAnimal() {
		return repository.findAll();
		
	}
	
	// MÉTODO PARA BUSCAR ANIMAL POR ID
	
	public Animal ProcurarPorId(Integer id) {
		return repository.findById(id).get();
		
	}
	
	// MÉTODO PARA ADICIONAR ANIMAL
	
	public String AdicionarAnimal(Animal animal) {
		repository.save(animal);
		return "Animal adicionado com sucesso!";		
		
	}
	
	
	// MÉTODO PARA ATUALIZAR DADOS DO ANIMAL(EDITAR)
	
	public String EditarAnimal(Integer id, Animal animal) {
		Animal controle = repository.findById(id).get();
		controle.setNome(animal.getNome());
		controle.setEspecie(animal.getEspecie());
		controle.setRaca(animal.getRaca());
		controle.setIdade(animal.getIdade());
		controle.setDono(animal.getDono());
		
		repository.save(controle);
		return "Animal editado com sucesso!";
		
	}
	
	// MÉTODO PARA EXCLUIR ANIMAL
	
	public String ExcluirAnimal(Integer id) {
		
		Animal controle = repository.findById(id).get();
		repository.delete(controle);
		return "Animal excluido com sucesso!";
	}
	

}
