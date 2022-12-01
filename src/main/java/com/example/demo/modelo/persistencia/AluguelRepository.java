package com.example.demo.modelo.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.entidade.Aluguel;

@Repository
public interface AluguelRepository extends JpaRepository<Aluguel, Long>{

}
