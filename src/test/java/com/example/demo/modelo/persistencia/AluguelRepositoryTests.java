package com.example.demo.modelo.persistencia;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.modelo.entidade.*;

@SpringBootTest
class AluguelRepositoryTests {

	@Autowired
    private AluguelRepository aluguelRepository;

    @Test
    void testAdicionaAluguel(){
        Roupa roupa = new Roupa();
        roupa.setNome("Vestido primavera");
        roupa.setValor(500.0);
        roupa.setTamanho("P");
        roupa.setCor("Rosa");
        roupa.setTipo("Sport Fino");
        roupa.setMaterial("Algodão");

        Calcado calcado = new Calcado();
        calcado.setNome("Scarpin");
        calcado.setValor(200.0);
        calcado.setTamanho("P");
        calcado.setNumeracao(36);
        calcado.setTipoDeSalto("Agulha");
        
        List<Vestuario> itensAlugados = new ArrayList<Vestuario>();
        itensAlugados.add(calcado);
        itensAlugados.add(roupa);
        
        Aluguel aluguel = new Aluguel();
        aluguel.setItemAluguel(itensAlugados);
        aluguel.setStatus(Status.Proposto);
        
        Cliente cliente = new Cliente();
        cliente.setNome("Joao");
        cliente.setEndereco("Paiva");
        aluguel.setCliente(cliente);
        
        Aluguel aluguelValidacao = aluguelRepository.save(aluguel);

        assertNotNull(aluguelValidacao);
        assertEquals(aluguel.getCodigo(), aluguelValidacao.getCodigo());
    }
	
	

}
