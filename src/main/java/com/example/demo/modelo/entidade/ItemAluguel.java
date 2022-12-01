package com.example.demo.modelo.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ItemAluguel {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "vestuario_id")
    private Vestuario produto;
    @ManyToOne
    @JoinColumn(name = "aluguel_id")
    private Aluguel aluguel;
    private Integer quantidade;
    private double valor;
    private double subtotal;
	
    public ItemAluguel() {
	}
    
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Vestuario getProduto() {
		return produto;
	}
	public void setProduto(Vestuario produto) {
		this.produto = produto;
	}
	public Aluguel getAluguel() {
		return aluguel;
	}
	public void setAluguel(Aluguel aluguel) {
		this.aluguel = aluguel;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	@Override
	public String toString() {
		return "ItemPedido [id=" + id + ", produto=" + produto + ", aluguel=" + aluguel + ", quantidade=" + quantidade
				+ ", valor=" + valor + ", subtotal=" + subtotal + "]";
	}
}
