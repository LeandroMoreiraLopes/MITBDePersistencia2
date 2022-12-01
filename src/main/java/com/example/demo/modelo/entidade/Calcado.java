package com.example.demo.modelo.entidade;

import javax.persistence.Entity;

@Entity
public class Calcado extends Vestuario{
	
	private int numeracao;
	private String tipoDeSalto;
	
	public int getNumeracao() {
		return numeracao;
	}
	public void setNumeracao(int numeracao) {
		this.numeracao = numeracao;
	}
	public String getTipoDeSalto() {
		return tipoDeSalto;
	}
	public void setTipoDeSalto(String tipoDeSalto) {
		this.tipoDeSalto = tipoDeSalto;
	}	
}
