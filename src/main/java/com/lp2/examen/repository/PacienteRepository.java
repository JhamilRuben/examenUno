package com.lp2.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lp2.examen.model.Paciente;


@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long>{

}
