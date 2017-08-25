package com.developer.ioo.biblioteca;

public class Aluno extends Usuarios {
	
	// Atributos
	private String curso;
	
	// Método Construtor
	public Aluno(String nome, String endereco) {
		this.enderecoCompleto = endereco;
		this.nome = nome;
	}
	
	// Métodos Especiais Getters e Setters	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}

	// Métodos Internos
	@Override // Sobreposição
	public void cadastrarUsuario(String curso) {
		this.curso = curso;
		System.out.println("Nome: " + nome + "\nEndereço Completo: " + enderecoCompleto + "\nCurso: " + curso);
	}
}