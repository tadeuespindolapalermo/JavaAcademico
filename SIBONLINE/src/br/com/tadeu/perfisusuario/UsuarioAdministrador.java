package br.com.tadeu.perfisusuario;

import br.com.tadeu.biblioteca.Livro;

public class UsuarioAdministrador extends Livro {
	
	//  Perfil de acesso de administração(bibliotecário)
		
	public void cadastrarUsuario(String nome, String perfil, int matricula, int[] senha,
			String situacao, boolean primeiroAcesso, String email) {
		
		this.setAluno(true);
		this.setNome(nome);
		this.setPerfil(perfil);
		this.setMatricula(matricula);
		this.setSenha(senha);
		this.setSituacao(situacao);
		this.setPrimeiroAcesso(primeiroAcesso);
		this.setEmail(email);
		System.out.println();
		System.out.println("Imprimindo dados o novo usuário cadastrado...\n");
		System.out.println("Nome: " + getNome());
		System.out.println("Perfil: " + getPerfil());
		System.out.println("Matrícula: " + getMatricula());
		//System.out.println("Senha: " + (getSenha().length));
		int v = 0;
		System.out.print("Senha: ");
		while (v <= getSenha().length * 4) {			
			System.out.print("*" );
			v++;			
		}
		System.out.println();
		System.out.println("Situação: " + getSituacao());
		System.out.println("Primeiro acesso: " + isPrimeiroAcesso());
		System.out.println("E-mail: " + getEmail());
		
	}
	
	public void manter() {
		
		/* perfil, número da matrícula, senha, nome, situação(ativo ou inativo), 
		 * indicador de primeiro acesso e e-mail)
		 */
		
	System.out.println("Programação para manter usuário a ser desenvolvida...");
			
	}
}
