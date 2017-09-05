package br.com.tadeudeveloper.guerraninja;

public class ClassePrincipal_01 {

	public static void main(String[] args) {
		
		Ninja ninja[] = new Ninja[5];
		
		ninja[0] = new NinjaTerra("NinjaTerra");   // NinjaTerra
		ninja[1] = new NinjaAgua ("NinjaAgua");    // NinjaAgua
		ninja[2] = new NinjaFogo ("NinjaFogo");    // NinjaFogo
		ninja[3] = new NinjaVento("NinjaVento");   // NinjaVento
		ninja[4] = new NinjaRaio ("NinjaRaio");    // NinjaRaio		
		
		System.out.println("===============================================================");
		System.out.println("========== Exercício da Aula 03 - Fundamentos da POO ==========");
		System.out.println("===============================================================");
		System.out.println("       GUERRA NINJA: TERRA - AGUA - FOGO - VENTO - RAIO"        );
		System.out.println("===============================================================");
		System.out.println("           Disciplina: Programação Orientada à Objetos"         );
		System.out.println("            Instituição: Faculdade JK - Santa Maria"            );
		System.out.println("             Período: 4. Semestre - Turma: SIST4A"              );
		System.out.println("              Professor: Gabriel Miranda Carvalho"              );		
		System.out.println("                Aluno: Tadeu Espíndola Palermo"                 );		
		System.out.println("===============================================================\n");
		
		// ..................................................................................................................//
		
		// PRIMEIRA LUTA
		System.out.println("A primeira luta será entre os ninjas: " + ninja[0].getNome() + " e " + ninja[1].getNome() + "\n");
		Luta l1 = new Luta(ninja[0],ninja[1]);  // NinjaTerra e NinjaAgua
		l1.iniciarLuta();
		
		// SEGUNDA LUTA
		System.out.println("A segunda luta será entre os ninjas: " + ninja[0].getNome() + " e " + ninja[2].getNome() + "\n");
		Luta l2 = new Luta(ninja[0],ninja[2]);  // NinjaTerra e NinjaFogo
		l2.iniciarLuta();
		
		// TERCEIRA LUTA
		System.out.println("A terceira luta será entre os ninjas: " + ninja[0].getNome() + " e " + ninja[3].getNome() + "\n");
		Luta l3 = new Luta(ninja[0],ninja[3]);  // NinjaTerra e NinjaVento
		l3.iniciarLuta();
		
		// QUARTA LUTA
		System.out.println("A quarta luta será entre os ninjas: " + ninja[0].getNome() + " e " + ninja[4].getNome() + "\n");
		Luta l4 = new Luta(ninja[0],ninja[4]);  // NinjaTerra e NinjaRaio
		l4.iniciarLuta();
		
		// .................................................................................................................//
		
		// QUINTA LUTA
		System.out.println("A quinta luta será entre os ninjas: " + ninja[1].getNome() + " e " + ninja[2].getNome() + "\n");
		Luta l5 = new Luta(ninja[1],ninja[2]);  // NinjaAgua e NinjaFogo
		l5.iniciarLuta();
		
		// SEXTA LUTA
		System.out.println("A sexta luta será entre os ninjas: " + ninja[1].getNome() + " e " + ninja[3].getNome() + "\n");
		Luta l6 = new Luta(ninja[1],ninja[3]);  // NinjaAgua e NinjaVento
		l6.iniciarLuta();
		
		// SÉTIMA LUTA
		System.out.println("A sétima luta será entre os ninjas: " + ninja[1].getNome() + " e " + ninja[4].getNome() + "\n");
		Luta l7 = new Luta(ninja[1],ninja[4]);  // NinjaAgua e NinjaRaio
		l7.iniciarLuta();
		
		// .................................................................................................................//
		
		// OITAVA LUTA
		System.out.println("A oitava luta será entre os ninjas: " + ninja[2].getNome() + " e " + ninja[3].getNome() + "\n");
		Luta l8 = new Luta(ninja[2],ninja[3]);  // NinjaFogo e NinjaVento
		l8.iniciarLuta();
		
		// NONA LUTA
		System.out.println("A nona luta será entre os ninjas: " + ninja[2].getNome() + " e " + ninja[4].getNome() + "\n");
		Luta l9 = new Luta(ninja[2],ninja[4]);  // NinjaFogo e NinjaRaio
		l9.iniciarLuta();
		
		// ................................................................................................................//
		
		// DÉCIMA LUTA
		System.out.println("A décima luta será entre os ninjas: " + ninja[3].getNome() + " e " + ninja[4].getNome() + "\n");
		Luta l10 = new Luta(ninja[3],ninja[4]); // NinjaVento e NinjaRaio			
		l10.iniciarLuta();
		
		// ................................................................................................................//
		
		// Ranking de pontuação dos ninjas ordenado do melhor para o pior
		int[] vetor = new int[5];		
		
		vetor[0] = ninja[0].getPontos();
		vetor[1] = ninja[1].getPontos();
		vetor[2] = ninja[2].getPontos();
		vetor[3] = ninja[3].getPontos();
		vetor[4] = ninja[4].getPontos();		
		
		Sort ordenar = new Sort();
		int[] ordenado = ordenar.sort(vetor);		
		
		String primeiro = "PRIMEIRÍSSIMO LUGAR: " + ordenado[4] + " pontos - ";
		String segundo = " SEGUNDO LUGAR: " + ordenado[3] + " pontos - ";
		String terceiro = "TERCEIRO LUGAR: " + ordenado[2] + " pontos - ";
		String quarto = "  QUARTO LUGAR: " + ordenado[1] + " pontos - ";
		String quinto = "  QUINTO LUGAR: " + ordenado[0] + " pontos - ";		
		
		String ranking1 = ""; 
		String ranking2 = "";
		String ranking3 = "";
		String ranking4 = "";
		String ranking5 = "";	
		
		// PRIMEIRO LUGAR
		if (ninja[0].getPontos() == ordenado[4]) {
			ranking1 = primeiro + ninja[0].getNome() + " ***";
		} else if (ninja[1].getPontos() == ordenado[4]) {
			ranking1 = primeiro + ninja[1].getNome() + " ***";
		} else if (ninja[2].getPontos() == ordenado[4]) {
			ranking1 = primeiro + ninja[2].getNome() + " ***";  
		} else if (ninja[3].getPontos() == ordenado[4]) {
			ranking1 = primeiro + ninja[3].getNome() + " ***";
		} else if (ninja[4].getPontos() == ordenado[4]) {
			ranking1 = primeiro + ninja[4].getNome() + " ***";
		} 
		
		// SEGUNDO LUGAR
		if (ninja[0].getPontos() == ordenado[3]) {
			ranking2 = segundo + ninja[0].getNome();
		} else if (ninja[1].getPontos() == ordenado[3]) {
			ranking2 = segundo + ninja[1].getNome();            
		} else if (ninja[2].getPontos() == ordenado[3]) {
			ranking2 = segundo + ninja[2].getNome();
		} else if (ninja[3].getPontos() == ordenado[3]) {
			ranking2 = segundo + ninja[3].getNome();
		} else if (ninja[4].getPontos() == ordenado[3]) {
			ranking2 = segundo + ninja[4].getNome();
		} 
		
		// TERCEIRO LUGAR			
		if (ninja[0].getPontos() == ordenado[2]) {
			ranking3 = terceiro + ninja[0].getNome();
		} else if (ninja[1].getPontos() == ordenado[2]) {
			ranking3 = terceiro + ninja[1].getNome();         
		} else if (ninja[2].getPontos() == ordenado[2]) {
			ranking3 = terceiro + ninja[2].getNome();
		} else if (ninja[3].getPontos() == ordenado[2]) {
			ranking3 = terceiro + ninja[3].getNome();
		} else if (ninja[4].getPontos() == ordenado[2]) {
			ranking3 = terceiro + ninja[4].getNome();
		} 
		
		// QUARTO LUGAR
		if (ninja[0].getPontos() == ordenado[1]) {
			ranking4 = quarto + ninja[0].getNome();
		} else if (ninja[1].getPontos() == ordenado[1]) {
			ranking4 = quarto + ninja[1].getNome();            
		} else if (ninja[2].getPontos() == ordenado[1]) {
			ranking4 = quarto + ninja[2].getNome();
		} else if (ninja[3].getPontos() == ordenado[1]) {
			ranking4 = quarto + ninja[3].getNome();
		} else if (ninja[4].getPontos() == ordenado[1]) {
			ranking4 = quarto + ninja[4].getNome();
		} 
		
		// QUINTO LUGAR
		if (ninja[0].getPontos() == ordenado[0]) {
			ranking5 = quinto + ninja[0].getNome();
		} else if (ninja[1].getPontos() == ordenado[0]) {
			ranking5 = quinto + ninja[1].getNome();           
		} else if (ninja[2].getPontos() == ordenado[0]) {
			ranking5 = quinto + ninja[2].getNome();
		} else if (ninja[3].getPontos() == ordenado[0]) {
			ranking5 = quinto + ninja[3].getNome();
		} else if (ninja[4].getPontos() == ordenado[0]) {
			ranking5 = quinto + ninja[4].getNome();
		} 
		
		System.out.println("     |RANKING OFICIAL DE PONTUAÇÃO DOS NINJAS|");
		System.out.println("         [ORDENADO DO MELHOR PARA O PIOR]"     );		
		System.out.println("===================================================");
		System.out.println("            GRANDE VENCEDOR INVICTO:\n");
		System.out.println("*** " + ranking1 + "\n");
		System.out.println("===================================================");
		System.out.println("        " + ranking2 + "\n");
		System.out.println("        " + ranking3 + "\n");
		System.out.println("        " + ranking4 + "\n");
		System.out.println("        " + ranking5 + "\n");	
		System.out.println("===================================================");
	}
}