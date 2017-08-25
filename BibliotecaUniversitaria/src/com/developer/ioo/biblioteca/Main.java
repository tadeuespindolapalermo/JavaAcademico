package com.developer.ioo.biblioteca;

import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("             |==============================|");
		System.out.println("             | BIBLIOTECA UNIVERSITÁRIA v1.0|");
		System.out.println("             | Por: T@deu Espíndola Palermo |");
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
		System.out.println("Olá! Seja bem-vindo ao Sistema BIBLIOTECA UNIVERSITÁRIA! ! !");
		System.out.println("************************************************************");
		System.out.println();
		System.out.print("Deseja listar o cadastro do sistema? (0)-NÃO / (1)-SIM: ");
		int a;
		a = teclado.nextInt();		
		
		if (a == 1) {
			
			System.out.println("Varrendo o cadastro do sistema! Aguarde por favor...");
			System.out.println();
			System.out.println("========================== OBRAS ==========================");
			System.out.println();
			Obra o1 = new Obra();
			Obra o2 = new Obra();
			o1.cadastrarObra("Vida de Portugal", "Português", "Central", 1999, "E-book", "Graciliano",
					"Brasileira", 01);				
			System.out.println(o1.toString()); 
			System.out.println();
			o1.historicoEmprestimo();
			System.out.println("***********************************************************");
			System.out.println();
			
			o2.cadastrarObra("50 tons de cinza", "Inglês", "Vida", 1985, "CD", "Graça Reis",
					"francesa", 02);
			System.out.println(o2.toString());
			System.out.println();
			o2.historicoEmprestimo();
			
			
			System.out.println("======================= FUNCIONÁRIOS ======================");	
			System.out.println();
			Funcionario f1 = new Funcionario("Douglas", "Rua das Olivetas, 5000");
			Funcionario f2 = new Funcionario("Ana", "Rua Dourada, 1000");
			Funcionario f3 = new Funcionario("Gertrudes", "Rua Clean, 500");
			f1.cadastrarUsuario("Estoque");	
			System.out.println("***********************************************************");
			f2.cadastrarUsuario("Biblioteca");
			System.out.println("***********************************************************");
			f3.cadastrarUsuario("Limpeza");
			
			
			System.out.println();
			System.out.println("======================= PROFESSORES =======================");	
			System.out.println();
			Professor p1 = new Professor("Gleidson", "Rua das Palmeiras, 800");		
			Professor p2 = new Professor("George", "Rua dos Goianos, 750");		
			Professor p3 = new Professor("Eduardo", "Rua dos Mobiles, 400");
			p1.cadastrarUsuario("IOO");
			System.out.println("***********************************************************");
			p2.cadastrarUsuario("Coordenação de TI");
			System.out.println("***********************************************************");
			p3.cadastrarUsuario("Programação para Dispositivos Móveis");
			
			
			System.out.println();
			System.out.println("========================= ALUNOS ==========================");
			System.out.println();
			Aluno a1 = new Aluno("Tadeu", "Rua Amazonas, 630");
			Aluno a2 = new Aluno("Hugo", "Rua das Carmélias, 440");
			Aluno a3 = new Aluno("Marcos", "Rua do Alecrim Dourado, 666");
			a1.cadastrarUsuario("Python 3");
			System.out.println("***********************************************************");
			a2.cadastrarUsuario("PHP 7");
			System.out.println("***********************************************************");
			a3.cadastrarUsuario("Java Avançado");	
			System.out.println();
			System.out.println();
			System.out.println("/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/");
			System.out.println("           Fim do programa! Obrigado por utilizar!"         );
			System.out.println("/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/");
			
		} else {	
			
			System.out.println();
	    	System.out.println("Você optou por listar nenhum cadastro! Encerrando o programa...");
	    	System.out.println("Obrigado por utilizar! Volte sempre!");
	    	System.out.println();
	    	System.out.println("FIM");    		
	    	System.out.println("-----------------------------------------------------------");
	    	teclado.close();
		}
	}
}