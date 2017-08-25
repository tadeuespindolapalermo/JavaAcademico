package br.com.tadeu.principal;

import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.tadeu.perfisusuario.UsuarioAdministrador;
import br.com.tadeu.perfisusuario.UsuarioAluno;

public class MenuAluno extends UsuarioAdministrador {
	
	Scanner teclado = new Scanner(System.in);	
	UsuarioAdministrador admin = new UsuarioAdministrador();
	UsuarioAluno aluno = new UsuarioAluno();
	
	public void menu() {
		
		try {
			
			System.out.println();
			System.out.print("Digite uma opção: (0)- SAIR / (1)- ACESSAR MENU: ");		
			int a;
			a = teclado.nextInt();
		
			if (a == 1 ) {				
				System.out.println();
				System.out.println("=================== MENU DE ALUNO================");
				System.out.println("1 - Consultar livro");
				System.out.println("2 - Efetuar reservas de livro");
				System.out.println("3 - Registrar interesse de reserva de livro");
				System.out.println("4 - SAIR");	
				System.out.println("===============================================\n");
		
				System.out.print("Digite uma opção: ");				
		
				try {		
		
					int b;
					b = teclado.nextInt();
		
					switch (b) {		
		
					case 1:
						System.out.println();
						System.out.println("***CONSULTAR LIVRO***\n");
						aluno.consultar();
						menu();
						break;
		
					case 2:
						System.out.println();
						System.out.println("**EFETUAR RESERVAS DE LIVRO***\n");
						aluno.efetuarReserva();
						menu();
						break;
		
					case 3:
						System.out.println();
						System.out.println("***REGISTRAR INTERESSE DE RESERVA***\n");
						System.out.print("Data da reserva: ");
						int data;
						data = teclado.nextInt();
						aluno.registrarInteresse(data);
						menu();
						break;
					
					case 4:
						System.out.println("Encerrando o programa... ");
						System.out.println("Obrigado por utilizar! Até a próxima!");
						JOptionPane.showMessageDialog(null, "Encerrando o programa...");
						teclado.close();
						break;
		
					default:
		
						System.out.println("Opção inválida! Encerrando...");
						JOptionPane.showMessageDialog(null, "Opção inválida! Encerrando...");							
					}
		
				} catch (Exception e) {					
					e.printStackTrace();
					System.out.println("Opção inválida! Encerrando...");
					JOptionPane.showMessageDialog(null, "Opção inválida! Encerrando...");		
				}
		
			} else if (a != 0 && a != 1) {
				
				System.out.println("Opção inválida! Encerrando...");
				JOptionPane.showMessageDialog(null, "Opção inválida! Encerrando...");
				teclado.close();
		
						
			} else {
				
				System.out.println();
				System.out.println("Você optou por sair! Encerrando o programa...");
				System.out.println("Obrigado por utilizar! Volte sempre!");
				System.out.println();
				System.out.println("FIM");    		
				System.out.println("-----------------------------------------------------------");
				teclado.close();	
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("Opção inválida! Encerrando...");
			JOptionPane.showMessageDialog(null, "Opção inválida! Encerrando...");			
		}		
	}
}
