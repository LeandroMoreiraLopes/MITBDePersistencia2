package com.example.demo;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.example.demo.modelo.entidade.Cliente;
import com.example.demo.modelo.persistencia.ClienteRepository;

@SpringBootApplication
public class Pedido2Application {

	public static void main(String[] args) {
		SpringApplication.run(Pedido2Application.class, args);
		
	}
	
	@Bean
	public CommandLineRunner run(ClienteRepository repo) {
		return (args) -> {
			List<Cliente> clientes = (List<Cliente>) repo.findAll();
			System.out.println(clientes);
			Long count = repo.count();
			System.out.println(count);
			Page<Cliente> paginaClientes = repo.findAll(PageRequest.of(1, 4));
			System.out.println(paginaClientes.getContent());
			
			List<Cliente> clientesA = repo.findByEndereco("Rua A");
			System.out.println(clientesA.size());
			
			List<Cliente> clientesB = repo.findByEnderecoAndNome("Rua B", "Jose");
			System.out.println(clientesB.size());
			System.out.println(repo.countByEnderecoAndNome("Rua B", "Jose"));
			
			System.out.println(repo.findDistinctByNome("Alberto"));
		};
	}

}
