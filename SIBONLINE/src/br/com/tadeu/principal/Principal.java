package br.com.tadeu.principal;

import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.tadeu.perfisusuario.AutenticacaoUsuario;
import br.com.tadeu.sistemacentraldaescola.Aluno;

public class Principal extends MenuAdministrador{
	
	public static void main(String[] args) {
		
		/* Aluno: Tadeu Espíndola Palermo - MAT: 11601804
		 * Implementação básica em Java: "Sistema SIBONLINE"
		 * Ferramenta utilizada: Eclipse IDE for Java Developers Version: Neon.3 Release (4.6.3)
		 * Disciplina: Introdução à Orientação a Objetos
		 * Professor Mestre: Gleidson Porto
		 * Faculdade JK - Unidade Santa Maria
		 * Curso: Bacharelado em Sistemas de Informação
		 * Período: Terceiro Semestre
		 * Data: 21/06/2017 - 14:30h
		 */ 
		
		// SIBONLINE é um software responsável pelo controle das atividades de biblioteca 
		// de uma faculdade hipotética de Brasília.
		
		
		MenuAdministrador menuAdministrador = new MenuAdministrador();
		MenuAluno menuAluno = new MenuAluno();		
		Aluno aluno = new Aluno();
		AutenticacaoUsuario autenticar = new AutenticacaoUsuario();
		
		JOptionPane.showMessageDialog(null, "Bem-vindo ao SIBONLINE... Pressione OK para continuar");
		
		System.out.println("             |==============================|");
		System.out.println("             |   SISTEMA SIBONLINE - v1.0   |");
		System.out.println("             | Sistema de Biblioteca Online |");
		System.out.println("             | Por: Tadeu Espíndola Palermo |");
		System.out.println("             | Disciplina: Introdução à OO  |");
		System.out.println("             | Prof. Mestre. Gleidson Porto |");
		System.out.println("             |==============================|");
		System.out.println();	
		
		Date relogio = new Date();
		System.out.println("************************************************************");
        System.out.print("***** Hora e Data Atuais: ");
        System.out.println(relogio.toString() + " *****");
        
        Scanner teclado = new Scanner(System.in);		
		System.out.println("************************************************************");
		System.out.println("Olá! Seja bem-vindo ao Sistema SIBONLINE - Biblioteca Online");
		System.out.println("************************************************************");
		System.out.println();
		
		System.out.print("Digite uma opção: (1)- ADMINISTRADOR / (2)- ALUNO: ");		
		int option;
		option = teclado.nextInt();
		
		try {
			
			if (option == 1) {
				aluno.setAluno(false);
				System.out.println();
				System.out.print("Entre com a senha de Administrador: "); // SENHA: admin
				String senha;
				senha = teclado.next();
				
				if (senha.equals("admin")) { // senha de acesso para administrador: admin
					autenticar.autenticarUsuario();
					menuAdministrador.menu();
					
				} else {
					
					System.out.println("Senha inválida! Encerrando...");
					JOptionPane.showMessageDialog(null, "Senha inválida! Encerrando...");
					teclado.close();
				}
				
			} else if (option == 2) {
				aluno.setAluno(true);
				menuAluno.menu();
				
			} else if (option != 1 && option != 2) {

				System.out.println("Opção inválida! Encerrando...");
				JOptionPane.showMessageDialog(null, "Opção inválida! Encerrando...");
				teclado.close();
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("Opção inválida! Encerrando...");
			JOptionPane.showMessageDialog(null, "Opção inválida! Encerrando...");	
			
		}		
	}
}