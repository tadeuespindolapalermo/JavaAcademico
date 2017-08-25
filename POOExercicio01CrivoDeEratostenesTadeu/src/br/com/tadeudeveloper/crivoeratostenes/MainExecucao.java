package br.com.tadeudeveloper.crivoeratostenes;

import java.util.Scanner;
import java.util.Set;

public class MainExecucao {

	public static void main(String[] args) {
		
		System.out.println("*******************************************");
		System.out.println("*************** Exercício 01 **************");
		System.out.println("*******************************************");
		System.out.println("!!!!!!!!!!!CRIVO DE ERATÓSTENES!!!!!!!!!!!!");
		System.out.println("*******************************************");
		System.out.println("Disciplina: Programação Orientada à Objetos");
		System.out.println("  Instituição: Faculdade JK - Santa Maria"  );
		System.out.println("    Período: 4. Semestre - Turma: SIST4A"   );
		System.out.println("    Professor: Gabriel Miranda Carvalho"    );		
		System.out.println("       Aluno: Tadeu Espíndola Palermo"      );		
		System.out.println("*******************************************\n");
		
		/* Escreva	um	código	Java	que	consiga	resolver o Crivo de	Eratóstenes
		 * (https://pt.wikipedia.org/wiki/Crivo_de_Eratóstenes). Para criar esse
		 * programa você deverá criar uma nova classe chamada CrivoEratostenes	e nela
		 * deverá	ter	um	método publico	chamado resolver que receberá como parâmetro
		 * um número inteiro maior que	1 e	deverá imprimir	na	tela todos	os números
		 * primos até esse número informado como argumento.
		 */		
		
		Scanner teclado = new Scanner(System.in);
		
		try {
			System.out.print("Por favor, informe o valor limite para listar os números primos: ");
			int t = teclado.nextInt();
			
			CrivoEratostenes crivo = new CrivoEratostenes();      
			
	        Set<Integer> p1 = crivo.resolver(t);   		        
	        System.out.println();
	        
	        if (t == 1) {
	        	System.out.println("Números primos a listar...: " + p1.size() + "\n");
	        } else {
	        	System.out.println("Números primos a listar...: " + p1.size() + "\n");        
		        System.out.println("Listando...");    
		        
		        for (Integer primos : p1) {        	
		            System.out.print("| " + primos);
		        }            
		        System.exit(0);     
		        teclado.close();
	        }	        
	        
		} catch (Exception e) {
			System.out.println();
			System.out.println("OPS! Você digitou um valor inválido!\n");
			System.out.println("Sinto muito! SAINDO...");        	
		}		   
	}
}