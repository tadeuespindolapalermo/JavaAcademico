package com.developer.ioo.biblioteca;

public class Funcionario extends Usuarios {	
	
	// Método Construtor
	public Funcionario(String nome, String endereco) {
		this.enderecoCompleto = endereco;
		this.nome = nome;		
	}
	// Métodos Internos
	@Override //Sobreposição
    public void cadastrarUsuario(String departamento) {
		this.departamento = departamento;
		System.out.println("Nome: " + nome + "\nEndereço Completo: " + enderecoCompleto + "\nDepartamento: " + departamento);
	}
}