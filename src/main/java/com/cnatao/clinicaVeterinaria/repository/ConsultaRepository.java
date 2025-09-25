package com.cnatao.clinicaVeterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cnatao.clinicaVeterinaria.entities.Consulta;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Integer>{

}
