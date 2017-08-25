// Tadeu Espíndola Palermo - Terceiro Semestre - Introdução à Orientação a Objetos
package br.com.tadeuespindolapalermo; // Pacote da classe

public class BatimentosCardiacos { // Declaração da classe pública
	
	// Atributos
	private String nome;
	private String sobrenome;
	private int diaNascimento;
	private int mesNascimento;
	private int anoNascimento;
	
	// Construtor
	public BatimentosCardiacos(String nome, String sobrenome, int diaNascimento, int mesNascimento,
			int anoNascimento) {
		
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.diaNascimento = diaNascimento;
		this.mesNascimento = mesNascimento;
		this.anoNascimento = anoNascimento;		
	}
	
	// Métodos Setter e Getter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getDiaNascimento() {
		return diaNascimento;
	}

	public void setDiaNascimento(int diaNascimento) {
		this.diaNascimento = diaNascimento;
	}

	public int getMesNascimento() {
		return mesNascimento;
	}

	public void setMesNascimento(int mesNascimento) {
		this.mesNascimento = mesNascimento;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	// Método para calcular e retornar a idade da pessoa (em anos)
	int idade;
	public int calcularIdade(int anoAtual) {		
		
		idade = anoAtual - getAnoNascimento();
		return idade;
	}
	
	// Método que calcula e retorna a frequência cardíaca máxima
	// 220 - idade
	int resultadoMaxima;
	public int calcularFrequenciaCardiacaMaxima() {		
		
		resultadoMaxima = 220 - idade;
		return resultadoMaxima;
	}
	
	// Método que calcula e retorna a frequência cardíaca-alvo da pessoa
	// Intervalo entre 50-80% da frequência cardíaca máxima
	public int[] calcularFrequenciaCardiacaAlvo() {		
		
		int resultadoAlvo[] = {resultadoMaxima * 50 / 100, resultadoMaxima * 80 / 100};
		return resultadoAlvo;		
	}
}