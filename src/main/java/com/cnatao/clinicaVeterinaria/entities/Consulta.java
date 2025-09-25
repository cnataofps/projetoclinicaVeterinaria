package com.cnatao.clinicaVeterinaria.entities;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Consulta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private LocalDate data;
	private String diagnostico;
	private String tratamento;
	@ManyToOne
	@JoinColumn(name = "animal_id")
	private Animal animal;
	
	
	public Consulta() {
		
	}


	public Consulta(Integer id, LocalDate data, String diagnostico, String tratamento, Animal animal) {
		super();
		this.id = id;
		this.data = data;
		this.diagnostico = diagnostico;
		this.tratamento = tratamento;
		this.animal = animal;
	}


	@Override
	public String toString() {
		return "Consulta [id=" + id + ", data=" + data + ", diagnostico=" + diagnostico + ", tratamento=" + tratamento
				+ ", animal=" + animal + "]";
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public LocalDate getData() {
		return data;
	}


	public void setData(LocalDate data) {
		this.data = data;
	}


	public String getDiagnostico() {
		return diagnostico;
	}


	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}


	public String getTratamento() {
		return tratamento;
	}


	public void setTratamento(String tratamento) {
		this.tratamento = tratamento;
	}


	public Animal getAnimal() {
		return animal;
	}


	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

}
	

	