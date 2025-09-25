package com.cnatao.clinicaVeterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cnatao.clinicaVeterinaria.entities.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer>{

}
