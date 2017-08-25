package br.com.tadeudeveloper.ordenacao;

import java.util.Scanner;

public class MainExecucao {
	
	private static void menu() {
		
		Scanner teclado = new Scanner(System.in);		
		Sort ordenacao = new Sort();			
		
		try {
			
			System.out.print("Digite o tamanho do vetor de inteiros que deseja ordenar: ");
			int a = teclado.nextInt();
			if (a == 0) {
				System.out.println("Não é possível ordenar um vetor vazio com " + a + " posições!");
				System.out.println("SAINDO...");
				System.exit(0);
			}
			
			int aux = 0;
			int[] vetor = new int[a];
			while (aux < a) {			
				System.out.print("Digite o valor da posição " + aux + " do vetor ou [S] para SAIR: ");					
				String b = teclado.next();
				if (b.toUpperCase().equals("S")) {
					System.out.println();
					System.out.println("SAINDO...");
					System.out.println("Obrigado por utilizar!!!");
					System.exit(0);			
				} else if(b.toUpperCase() != "S") {
					vetor[aux] = Integer.parseInt(b);
					aux++;	
				}									
			}	
			
			teclado.close();
			System.out.println();
			ordenacao.sort(vetor);	
			System.out.println();
			System.out.println("O vetor foi ordenado em ordem crescente (menor para o maior) com sucesso! Obrigado por utilizar!");
		
			
		} catch (Exception e) {
			System.out.println();
			System.out.println("Você não informou um número inteiro ou digitou um valor inválido!!!\n");
			System.out.println("Ocorreu a seguinte excessão: " + e + "\n");
			System.out.println("Sinto muito, saindo do programa! Obrigado por utilizar! Até a próxima!");
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("-=-=-=-=-=-=-=-= Exercício 02 -=-=-=-=-=-=-");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("  ORDENAÇÃO DE UM VETOR DE INTEIROS V1.0"   );
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Disciplina: Programação Orientada à Objetos");
		System.out.println("  Instituição: Faculdade JK - Santa Maria"  );
		System.out.println("    Período: 4. Semestre - Turma: SIST4A"   );
		System.out.println("    Professor: Gabriel Miranda Carvalho"    );		
		System.out.println("       Aluno: Tadeu Espíndola Palermo"      );		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
		/*System.out.println("*******************************************");
		System.out.println("Crie  uma  classe   chamada   Sort  e  nela");
		System.out.println("esreva   um   método   que   receba    como");
		System.out.println("parâmetro  um  vetor de  inteiros e retorne");
		System.out.println("esse vetor ordenadodo do menor para o maior");				
		System.out.println("*****************************************\n");*/		
		
		menu();
	}
}