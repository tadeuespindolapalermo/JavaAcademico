package br.com.tadeu.sistemacentraldaescola;

public class Aluno {
	
	/* O sistema deve se integrar com o Sistema Central da Escola para obter informações
	 * do aluno no momento do cadastramento do usuário da biblioteca e efetuar a 
	 * validação do usuário.
	 */
	
	private String nome;
	private String perfil;
	private int matricula; // número
	private int[] senha;
	private String situacao; // ativo ou inativo
	private boolean primeiroAcesso;
	private String email;	
	private boolean aluno; // É Aluno ou não			
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getPerfil() {
		return perfil;
	}
	
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public int[] getSenha() {
		return senha;
	}
	
	public void setSenha(int[] senha) {
		this.senha = senha;
	}
	
	public String getSituacao() {
		return situacao;
	}
	
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	public boolean isPrimeiroAcesso() {
		return primeiroAcesso;
	}
	
	public void setPrimeiroAcesso(boolean primeiroAcesso) {
		this.primeiroAcesso = primeiroAcesso;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean isAluno() {
		return aluno;
	}
	
	public void setAluno(boolean aluno) {
		this.aluno = aluno;
	}	
}
