package com.cnatao.clinicaVeterinaria.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Animal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String especie;
	private String raca;
	private int idade; 
	private String dono;
	
	
	
	public Animal() {
		
	}



	public Animal(Integer id, String nome, String especie, String raca, int idade, String dono) {
		super();
		this.id = id;
		this.nome = nome;
		this.especie = especie;
		this.raca = raca;
		this.idade = idade;
		this.dono = dono;
	}



	@Override
	public String toString() {
		return "Animal [id=" + id + ", nome=" + nome + ", especie=" + especie + ", raca=" + raca + ", idade=" + idade
				+ ", dono=" + dono + "]";
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEspecie() {
		return especie;
	}



	public void setEspecie(String especie) {
		this.especie = especie;
	}



	public String getRaca() {
		return raca;
	}



	public void setRaca(String raca) {
		this.raca = raca;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public String getDono() {
		return dono;
	}



	public void setDono(String dono) {
		this.dono = dono;
	}
	
	

}
