package com.example.demo.model;

public class Jogadores {
	
	private String nome;
	private int numero;
	
	
	
	public Jogadores(String nome, int numero) {
		super();
		this.nome = nome;
		this.numero = numero;
	}
	
	public Jogadores() {
		
	}
	
	
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	

}
