package com.example.demo.modelo.entidade;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Aluguel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
    @Enumerated(EnumType.STRING)
    private Status status;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Cliente cliente;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Vestuario> itemAluguel;

	public Aluguel() {
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Vestuario> getItemAluguel() {
		return itemAluguel;
	}

	public void setItemAluguel(List<Vestuario> itemAluguel) {
		this.itemAluguel = itemAluguel;
	}

	@Override
	public String toString() {
		return "Aluguel [codigo=" + codigo + ", status=" + status + ", cliente=" + cliente + ", itemAluguel="
				+ itemAluguel + "]";
	}
}
