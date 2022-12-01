package com.example.demo.modelo.entidade;

import javax.persistence.Entity;

@Entity
public class Roupa extends Vestuario{

	private String cor;
	private String tipo;
	private String material;
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
}
