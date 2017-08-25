package br.com.tadeudeveloper.thekingfighter;
import java.util.Scanner;

public class TheKingFighter {
	public static void main(String[] args) {
		
		Lutador l[] = new Lutador[6];		
		PesquisaBinaria Lutador = new PesquisaBinaria(6);
		Scanner teclado = new Scanner(System.in);
		
		l[0] = new Lutador("Tadeu Palermo", "Brasil", 31, 1.75f, 119.3f, 11, 2, 1);
		l[1] = new Lutador("Bruno Cavassola", "Espanha", 29, 1.68f, 57.8f, 14, 2, 3);
		l[2] = new Lutador("Ericson Neres", "México", 35, 1.65f, 80.9f, 12, 2, 1);
		l[3] = new Lutador("Paulo César Araújo", "EUA", 28, 1.93f, 81.6f, 13, 0, 2);
		l[4] = new Lutador("George Mendonça", "França", 37, 1.70f, 119.3f, 5, 4, 3);
		l[5] = new Lutador("Hugo Leonardo Bala", "Itália", 30, 1.81f, 60.1f, 12, 2, 4);		
		
		System.out.println("----------------------------------------------------");
		System.out.println("         THE KING FIGHTER v3.0 - copyleft           ");
		System.out.println("TCD - Estrutura de Dados(Prof.George H.R.E Mendonça)");
		System.out.println("Tadeu E.P, Bruno Cavassola, Paulo César, Ericson N. ");
		System.out.println("              Tema: PESQUISA BINÁRIA                ");
		System.out.println("----------------------------------------------------");
		
		Luta TKF01 = new Luta();
		TKF01.marcarLuta(l[1], l[5]);
		TKF01.lutar();
		
		Luta TKF02 = new Luta();
		TKF02.marcarLuta(l[2], l[3]);
		TKF02.lutar();
		
		Luta TKF03 = new Luta();
		TKF03.marcarLuta(l[0], l[4]);
		TKF03.lutar();
		
		Luta TKF04 = new Luta();
		TKF04.marcarLuta(l[1], l[4]);
		TKF04.lutar();
		
		System.out.println();
		System.out.println("STATUS ATUAL DOS LUTADORES CADASTRADOS NO SISTEMA:");
		System.out.println();
		l[0].status();
		System.out.println();
		l[1].status();
		System.out.println();
		l[2].status();
		System.out.println();
		l[3].status();
		System.out.println();
		l[4].status();
		System.out.println();
		l[5].status();
		
		l[0].ganharLuta();
		l[1].perderLuta();
		l[2].empatarLuta();
		
		Lutador.inserir(3);
		Lutador.inserir(1);
		Lutador.inserir(4);
		Lutador.inserir(2);
		Lutador.inserir(5);
		Lutador.inserir(0);
		
		System.out.println();
		System.out.println("*****************************************");
		System.out.println("    PESQUISA POR LUTADORES NO SISTEMA    ");
		System.out.println("*****************************************");
		System.out.println();
		System.out.print("Os lutadores cadastrados são: ");
		Lutador.exibir();
		System.out.println();		
		
		System.out.println("Lutador 3: "); 
		l[3].apresentarNome(); 
		System.out.println();
		
		System.out.println("Lutador 1: "); 
		l[1].apresentarNome(); 
		System.out.println();
		
		System.out.println("Lutador 4: "); 
		l[4].apresentarNome(); 
		System.out.println();
		
		System.out.println("Lutador 2: "); 
		l[2].apresentarNome(); 
		System.out.println();
		
		System.out.println("Lutador 5: "); 
		l[5].apresentarNome(); 
		System.out.println();
		
		System.out.println("Lutador 0: "); 
		l[0].apresentarNome(); 
		System.out.println();
		
		
		System.out.print("Lutadores Ordenados por ordem de cadastro: ");
		Lutador.bubbleSort();
		
		Lutador.exibir();	
		System.out.println();
		
		System.out.print("0 - "); l[0].apresentarNome(); 
		System.out.print("1 - "); l[1].apresentarNome(); 
		System.out.print("2 - "); l[2].apresentarNome();
		System.out.print("3 - "); l[3].apresentarNome();
		System.out.print("4 - "); l[4].apresentarNome();
		System.out.print("5 - "); l[5].apresentarNome();
		
		System.out.println();
		System.out.print("Deseja pesquisar por um Lutador? (0)-NÃO / (1)-SIM: ");
		int b;
		b = teclado.nextInt();
		if (b == 1) {
			int v;
			System.out.println();
	    	System.out.println("-----------------------------------------------------------");
	    	System.out.print("Escolha entre [0 a 5] o lutador que deseja pesquisar: ");    	
	    	v = teclado.nextInt();
	    	System.out.println("-----------------------------------------------------------");
	    	Lutador.BuscaBinaria(v);
	    	if (Lutador.BuscaBinaria(v) == -1) {
	    		System.out.println();
	    		System.out.print("O Lutador " + v + " não existe no sistema!!!");
	    		System.out.println();
	    		System.out.println("Encerrando o programa...");
	    		System.out.println();
	    		System.out.println("FIM");
	    		System.out.println("---------------------------------------");
	    	} else {
	    		System.out.println();
	    		System.out.println("Pesquisa realizada com sucesso >>> Lutador encontrado!!!");
	    		System.out.println();
	    		
	    		String x;
	    		if (v == 0) {
	    			x = "Tadeu Palermo";
	    			System.out.println("O Lutador pesquisado foi o " + x + " e encontra-se no índice " + Lutador.BuscaBinaria(v) + " da lista!");
		    		System.out.println();
	    		} else if (v == 1) {
	    			x = "Bruno Cavassola";
	    			System.out.println("O Lutador pesquisado foi o " + x + " e encontra-se no índice " + Lutador.BuscaBinaria(v) + " da lista!");
		    		System.out.println();
	    		} else if (v == 2) {
	    			x = "Ericson Neres";
	    			System.out.println("O Lutador pesquisado foi o " + x + " e encontra-se no índice " + Lutador.BuscaBinaria(v) + " da lista!");
		    		System.out.println();
	    		} else if (v == 3) {
	    			x = "Paulo César Araújo";
	    			System.out.println("O Lutador pesquisado foi o " + x + " e encontra-se no índice " + Lutador.BuscaBinaria(v) + " da lista!");
		    		System.out.println();
	    		} else if (v == 4) {
	    			x = "George Mendonça";
	    			System.out.println("O Lutador pesquisado foi o " + x + " e encontra-se no índice " + Lutador.BuscaBinaria(v) + " da lista!");
		    		System.out.println();
	    		} else if (v == 5) {
	    			x = "Hugo Leonardo Bala";
	    			System.out.println("O Lutador pesquisado foi o " + x + " e encontra-se no índice " + Lutador.BuscaBinaria(v) + " da lista!");
		    		System.out.println();	    		
	    		}	    		
	    		
	    		
	    			if (v == 0) 
	    				l[0].apresentarPesquisa();
	    		
	    			if (v == 1) 
	    				l[1].apresentarPesquisa();
	    		
	    			if (v == 2) 
	    				l[2].apresentarPesquisa();
	    		
	    			if (v == 3) 
	    				l[3].apresentarPesquisa();
	    		
	    			if (v == 4) 
	    				l[4].apresentarPesquisa();
	    		
	    			if (v == 5) 
	    				l[5].apresentarPesquisa();
	    		
	    		System.out.println();
	    		System.out.println("Encerrando o programa...");
	    		System.out.println("Obrigado por utilizar!");
	    		System.out.println();
	    		System.out.println("FIM");    		
	    		System.out.println("-------------------------------------------------------------------");
	    	}
			
		} else {
			System.out.println();
    		System.out.println("Ok. Encerrando o programa...");
    		System.out.println("Obrigado por utilizar!");
    		System.out.println();
    		System.out.println("FIM");    		
    		System.out.println("-------------------------------------------------------------------");
		}
		
		teclado.close();
	}
}
	    		