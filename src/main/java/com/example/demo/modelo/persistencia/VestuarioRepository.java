package com.example.demo.modelo.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.entidade.Vestuario;

@Repository
public interface VestuarioRepository extends JpaRepository<Vestuario, Long>{

}
