package com.developer.ioo.biblioteca;

public abstract class Usuarios {
	
	// Atributos
	protected String departamento;
	protected String enderecoCompleto;
	protected String nome;
	
	// Métodos Internos
	public void cadastrarUsuario(String endereco) {
		this.enderecoCompleto = endereco;
	}

	// Métodos Especiais Getters e Setters
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getEnderecoCompleto() {
		return enderecoCompleto;
	}

	public void setEnderecoCompleto(String enderecoCompleto) {
		this.enderecoCompleto = enderecoCompleto;
	}
}