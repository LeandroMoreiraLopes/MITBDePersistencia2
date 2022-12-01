package com.example.demo.modelo.persistencia;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.modelo.entidade.Calcado;
import com.example.demo.modelo.entidade.Roupa;
import com.example.demo.modelo.entidade.Vestuario;

@SpringBootTest
class VestuarioRepositoryTests {

    @Autowired
    private VestuarioRepository vestuarioRepository;

    @Test
    void testAdicionaVestuarioRoupa(){
        Roupa roupa = new Roupa();
        roupa.setNome("Paletó Spring");
        roupa.setValor(500.0);
        roupa.setTamanho("G");
        roupa.setCor("Azul");
        roupa.setTipo("Passeio completo");
        roupa.setMaterial("Linho");

        Roupa vestuarioValidacao = vestuarioRepository.save(roupa);

        assertNotNull(vestuarioValidacao);
        assertEquals(roupa.getId(), vestuarioValidacao.getId());
    }
    
    @Test
    void testAdicionaVestuarioCalcado(){
        Calcado calcado = new Calcado();
        calcado.setNome("Mocassino");
        calcado.setValor(100.0);
        calcado.setTamanho("M");
        calcado.setNumeracao(40);
        calcado.setTipoDeSalto("Baixo");
        
        Calcado vestuarioValidacao = vestuarioRepository.save(calcado);

        assertNotNull(vestuarioValidacao);
        assertEquals(calcado.getId(), vestuarioValidacao.getId());
    }
    
    @Test
    void testRemoveVestuarioCalcado(){
        Calcado calcado = new Calcado();
        calcado.setId(1L);
        
        vestuarioRepository.delete(calcado);
    }
}
