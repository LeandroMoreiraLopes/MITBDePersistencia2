package com.example.demo.modelo.persistencia;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.entidade.Cliente;

@Repository
public interface ClienteRepository extends PagingAndSortingRepository<Cliente, Long>{
	List<Cliente> findByEndereco(String endereco);
	List<Cliente> findByEnderecoAndNome(String endereco, String nome);
	List<Cliente> findDistinctByNome(String nome);
	
	long countByEnderecoAndNome(String endereco, String nome);
}
