package br.com.tadeudeveloper.guerraninja;

public class ClassePrincipal_02 {

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
		int p0 = ninja[0].getPontos();
		int p1 = ninja[1].getPontos();
		int p2 = ninja[2].getPontos();
		int p3 = ninja[3].getPontos();
		int p4 = ninja[4].getPontos();
		
		int[] vetor = {p0, p1, p2, p3, p4};
		Sort ordenar = new Sort();
		int[] ordenado = ordenar.sort(vetor);
		
		System.out.println("     |RANKING OFICIAL DE PONTUAÇÃO DOS NINJAS|");
		System.out.println("         [ORDENADO DO MELHOR PARA O PIOR]"     );		
		System.out.println("===================================================");
		System.out.println("         VENCEDOR INVICTO EM PRIMEIRO LUGAR:\n");
		System.out.println("           ***" + ninja[4].getNome() + ": " + ordenado[4] + " pontos!***");
		System.out.println("===================================================");
		System.out.println("        SEGUNDO LUGAR  - " + ninja[3].getNome() + ": " + ordenado[3] + " pontos!\n");
		System.out.println("        TERCEIRO LUGAR - " + ninja[2].getNome() + ":  " + ordenado[2] + " pontos!\n");
		System.out.println("        QUARTO LUGAR   - " + ninja[1].getNome() + ":  " + ordenado[1] + " pontos!\n");
		System.out.println("        QUINTO LUGAR   - " + ninja[0].getNome() + ": " + ordenado[0] + " pontos!");	
		System.out.println("===================================================");
	}
}