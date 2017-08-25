package br.com.tadeu.principal;

import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.tadeu.biblioteca.Livro;
import br.com.tadeu.perfisusuario.UsuarioAdministrador;



public class MenuAdministrador extends UsuarioAdministrador {
	
	Scanner teclado = new Scanner(System.in);	
	Livro livro = new Livro();
	
	
	
	public void menu() {
		
		try {
			
			System.out.println();
			System.out.print("Digite uma opção: (0)- SAIR / (1)- ACESSAR MENU: ");		
			int a;
			a = teclado.nextInt();
		
			if (a == 1 ) {				
				System.out.println();
				System.out.println("=============== MENU DE ADMINISTRADOR============");
				System.out.println("1 - Cadastrar novo usuário");
				System.out.println("2 - Realizar empréstimo de livro");
				System.out.println("3 - Emitir relatórios de livros");
				System.out.println("4 - Efetuar estorno/cancelamento do empréstimo");
				System.out.println("5 - Consultar livro");
				System.out.println("6 - Devolver livro");
				System.out.println("7 - Manter usuário");	
				System.out.println("8 - Manter livro");
				System.out.println("9 - SAIR");
				System.out.println("=================================================\n");
		
				System.out.print("Digite uma opção: ");				
		
				try {		
		
					int b;
					b = teclado.nextInt();
		
					switch (b) {
		
					case 1:			
						System.out.println();
						System.out.println("***CADASTRAR NOVO USUÁRIO***\n");
						System.out.print("Nome: ");
						String nome;
						nome = teclado.next();
		
						System.out.print("Perfil [Aluno/Administrador]: ");
						String perfil;
						perfil = teclado.next();
		
						System.out.print("Matrícula [informar somente números]: ");
						int matricula;
						matricula = teclado.nextInt();
		
						System.out.print("Senha [informar somente números]: ");
						int[] senha = new int[1];
						for(int i=0;i<1;i++) {							
							senha[i] = teclado.nextInt(); 							
						}				
		
						System.out.print("Situação [Ativo/Inativo]: ");
						String situacao;
						situacao = teclado.next();
		
						System.out.print("Primeiro acesso [true](sim) / [false](não)]: ");
						boolean primeiroAcesso;
						primeiroAcesso = teclado.nextBoolean();
		
						System.out.print("E-mail: ");
						String email;
						email = teclado.next();
		
						cadastrarUsuario(nome, perfil, matricula, senha, situacao, primeiroAcesso, 
								email);
		
						System.out.println("Usuário cadastrado com sucesso!");	
						menu();
						break;
		
					case 2:
						System.out.println();
						System.out.println("***REALIZAR EMPRÉSTIMO DE LIVRO***\n");
						System.out.print("Nome: ");
						String nomeEmp;
						nomeEmp = teclado.next();
		
						System.out.print("Perfil [Aluno/Administrador]: ");
						String perfilEmp;
						perfilEmp = teclado.next();
		
						System.out.print("Matrícula [informar somente números]: ");
						int matriculaEmp;
						matriculaEmp = teclado.nextInt();
		
						System.out.print("Senha [informar somente números]: ");
						int[] senhaEmp = new int[1];
						for(int i=0;i<1;i++) {							
							senhaEmp[i] = teclado.nextInt(); 
						}	
		
						System.out.print("Situação [Ativo/Inativo]: ");
						String situacaoEmp;
						situacaoEmp = teclado.next();
		
						System.out.print("Primeiro acesso [true](sim) / [false](não): ");
						boolean primeiroAcessoEmp;
						primeiroAcessoEmp = teclado.nextBoolean();
		
						System.out.print("E-mail: ");
						String emailEmp;
						emailEmp = teclado.next();
		
						System.out.print("Título: ");
						String tituloEmp;
						tituloEmp = teclado.next();
		
						System.out.print("ISBN [informar somente números]: ");
						int isbnEmp;
						isbnEmp = teclado.nextInt();
		
						System.out.print("Ano [informar somente números]: ");
						int anoEmp;
						anoEmp = teclado.nextInt();
		
						System.out.print("Editora: ");
						String editoraEmp;
						editoraEmp = teclado.next();
		
						System.out.print("Palavra chave: ");
						String palavraChaveEmp;
						palavraChaveEmp = teclado.next();
		
						System.out.print("Gênero: ");
						String generoEmp;
						generoEmp = teclado.next();
		
						System.out.print("Quantidade existente [informar somente números]: ");
						int quantidadeExistenteEmp;
						quantidadeExistenteEmp = teclado.nextInt();
		
						System.out.print("Quantidade não disponível [informar somente números]: ");
						int quantidadeNaoDisponivelEmp;
						quantidadeNaoDisponivelEmp = teclado.nextInt();
		
						System.out.print("Dia inicial [informar somente números]: ");
						int diaInicialEmp;
						diaInicialEmp = teclado.nextInt();
		
						System.out.print("Dia final [informar somente números]: ");
						int diaFinalEmp;
						diaFinalEmp = teclado.nextInt();
		
						System.out.print("Hora inicial: ");
						String horaInicialEmp;
						horaInicialEmp = teclado.next();
		
						System.out.print("Hora Final: ");
						String horaFinalEmp;
						horaFinalEmp = teclado.next();
		
						realizarEmprestimo(nomeEmp, perfilEmp, matriculaEmp, senhaEmp,
								situacaoEmp, primeiroAcessoEmp, emailEmp, tituloEmp, isbnEmp,
								anoEmp, editoraEmp, palavraChaveEmp, generoEmp, quantidadeExistenteEmp,
								quantidadeNaoDisponivelEmp, diaInicialEmp, diaFinalEmp,
								horaInicialEmp, horaFinalEmp);
						menu();
						break;
		
					case 3:
						System.out.println();
						System.out.println("***EMITIR RELATÓRIOS DE LIVRO***\n");
						System.out.print("Período inicial [informar somente números]: ");
						int periodoInicial;
						periodoInicial = teclado.nextInt();
		
						System.out.print("Período final [informar somente números]: ");
						int periodoFinal;
						periodoFinal = teclado.nextInt();
		
						emitirRelatorio(periodoInicial, periodoFinal);
						menu();
						break;
		
					case 4:
						System.out.println();
						System.out.println("***ESTORNAR EMPRÉSTIMO DE LIVRO***\n");
						estornarEmprestimo();
						menu();
						break;
		
					case 5:
						System.out.println();
						System.out.println("***CONSULTAR LIVRO***\n");
						consultar();
						menu();
						break;
		
					case 6:
						System.out.println();
						System.out.println("**DEVOLVER LIVRO***\n");
						devolver();
						menu();
						break;
		
					case 7:
						System.out.println();
						System.out.println("***MANTER USUÁRIO***\n");
						manter();
						menu();
						break;
						
					case 8:
						System.out.println();
						System.out.println("***MANTER LIVRO***\n");
						livro.manter();
						menu();
						break;
					
					case 9:
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
