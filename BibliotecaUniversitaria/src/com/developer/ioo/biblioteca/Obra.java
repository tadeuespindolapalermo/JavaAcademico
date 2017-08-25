package com.developer.ioo.biblioteca;

public class Obra {
	
	// Atributos	
	private String idioma;
	private String midia;
	private String livrosCientificos = "Livros Científicos";
	private String periodicosCientificos = "Periódicos Científicos";
	private String periodicosInformativos = "Periódicos Informativos";
	private String periodicosDiversos = "Periódicos Diversos";
	private String entretenimento = "Entretenimento";
	private String editora;
	private int anoEdicao;
	private String nacionalidadeAutor;
	private String nomeAutor;
	private String nomeObra;	
	private String classificacao;
	
	// Métodos	Internos
	public void historicoEmprestimo() {
		System.out.println("- Histórico dos empréstimos...");
		System.out.println("- Ainda não há empréstimos para essa obra!!!");
		System.out.println();
	}
	
	public void cadastrarObra(String nomeObra, String idioma, String editora, int anoEdicao, String midia, String nomeAutor,
			String nacionalidadeAutor, int classificacao) {
		
		this.nomeObra = nomeObra;
		this.idioma = idioma;
		this.editora = editora;
		this.anoEdicao = anoEdicao;
		this.midia = midia;
		this.nomeAutor = nomeAutor;	
		this.nacionalidadeAutor = nacionalidadeAutor;				
		
		if (classificacao == 01) {			
			setClassificacao(this.livrosCientificos);
		} else if (classificacao == 02) {
			setClassificacao(this.periodicosCientificos);				
		} else if (classificacao == 03) {
			setClassificacao(this.periodicosInformativos);						
		} else if (classificacao == 04) {
			setClassificacao(this.periodicosDiversos);				
		} else if (classificacao == 05) {
			setClassificacao(this.entretenimento);					
		}	
		System.out.println("- Classificação: " + getClassificacao());				
	}

	@Override
	public String toString() {
		return "- Obra: " + nomeObra + "\n- Autor: " + nomeAutor + "\n- Idioma do Exemplar: " + idioma + "\n- Mídia do Exemplar: " + midia + "\n- Editora do Exemplar: " + 
	editora + "\n- Ano de Edição: " + anoEdicao + "\n- Nacionalidade do Autor: " + nacionalidadeAutor;		
	}

	// Métodos Especiais Getters e Setters
	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getMidia() {
		return midia;
	}

	public void setMidia(String midia) {
		this.midia = midia;
	}

	public String getLivrosCientificos() {
		return livrosCientificos;
	}

	public void setLivrosCientificos(String livrosCientificos) {
		this.livrosCientificos = livrosCientificos;
	}

	public String getPeriodicosCientificos() {
		return periodicosCientificos;
	}

	public void setPeriodicosCientificos(String periodicosCientificos) {
		this.periodicosCientificos = periodicosCientificos;
	}

	public String getPeriodicosInformativos() {
		return periodicosInformativos;
	}

	public void setPeriodicosInformativos(String periodicosInformativos) {
		this.periodicosInformativos = periodicosInformativos;
	}

	public String getPeriodicosDiversos() {
		return periodicosDiversos;
	}

	public void setPeriodicosDiversos(String periodicosDiversos) {
		this.periodicosDiversos = periodicosDiversos;
	}

	public String getEntretenimento() {
		return entretenimento;
	}

	public void setEntretenimento(String entretenimento) {
		this.entretenimento = entretenimento;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getAnoEdicao() {
		return anoEdicao;
	}

	public void setAnoEdicao(int anoEdicao) {
		this.anoEdicao = anoEdicao;
	}

	public String getNacionalidadeAutor() {
		return nacionalidadeAutor;
	}

	public void setNacionalidadeAutor(String nacionalidadeAutor) {
		this.nacionalidadeAutor = nacionalidadeAutor;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	public String getNomeObra() {
		return nomeObra;
	}

	public void setNomeObra(String nomeObra) {
		this.nomeObra = nomeObra;
	}	
	
	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}	
}