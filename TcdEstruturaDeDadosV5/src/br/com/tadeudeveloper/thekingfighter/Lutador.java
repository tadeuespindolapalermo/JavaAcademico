package br.com.tadeudeveloper.thekingfighter;

public class Lutador {
	
	// Atributos;
	private String nome, nacionalidade, categoria;	
	private int idade, vitorias, derrotas, empates;
	private float altura, peso;	

	// Métodos Públicos Internos	
	public void apresentar() {
		System.out.println("----------------------------------------------------");
		System.out.println("CHEGOU A HORA!");
		System.out.println("Apresentamos o ilustre lutador " + this.getNome());
		System.out.println("Diretamente da " + this.getNacionalidade());
		System.out.println("Com " + this.getIdade() + " anos e " + this.getAltura() + 
				" de altura");
		System.out.println("Pesando " + this.getPeso() + "Kg");
		System.out.print("Possui " + this.getVitorias() + " vitórias");
		System.out.print(", além de " + this.getDerrotas() + " derrotas");
		System.out.println(" e " + this.getEmpates() + " empate(s).");
	}
	
	public void apresentarNome() {
		System.out.println(this.getNome());
	}
	
	public void apresentarPesquisa() {	
		System.out.println("******************************************");
		System.out.println("INFORMAÇÕES GERAIS DO LUTADOR ENCONTRADO: ");
		System.out.println("******************************************");
		System.out.println();
		System.out.println("Nome: " + this.getNome());
		System.out.println("País: " + this.getNacionalidade());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Altura: " + this.getAltura());				
		System.out.println("Peso: " + this.getPeso() + "Kg");
		System.out.println("Vitórias: " + this.getVitorias());
		System.out.println("Derrotas: " + this.getDerrotas());
		System.out.println("Empates: " + this.getEmpates());
	}
	
	public void status() {
		System.out.println(this.getNome() + " é da " + this.getCategoria());
		System.out.println("Ganhou " + this.getVitorias() + " vezes");
		System.out.println("Perdeu " + this.getDerrotas() + " vezes");
		System.out.println("Empatou " + this.getEmpates() + " vezes");		
	}
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}
	
	// Método Especial Construtor
	public Lutador(String no, String na, int id, float al, float pe, int vi, int de,
			int em) {
		
		this.nome = no;
		this.nacionalidade = na;
		this.idade = id;
		this.vitorias = vi;
		this.derrotas = de;
		this.empates = em;
		this.altura = al;
		this.setPeso(pe);
	}
	
	// Métodos Especiais Acessores Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getCategoria() {
		return categoria;
	}
	private void setCategoria() {
		if (this.peso < 52.2) {
			this.categoria = "Categoria Peso Inválido";
		} else if (this.peso <= 70.3) {
			this.categoria = "Categoria Peso Leve";
		} else if (this.peso <= 83.9) {
			this.categoria = "Categoria Peso Médio";
		} else if (this.peso <= 120.2 ) {
			this.categoria = "Categoria Peso Pesado";
		} else {
			this.categoria = "Categoria Peso Inválida!";
		}
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}	
}