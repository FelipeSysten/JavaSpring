package com.example.demo.model;

public class Tarefa {
	
	private int id;
	private String descricao;
	
	
	
	public Tarefa(int id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	}
	
	public Tarefa() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}


