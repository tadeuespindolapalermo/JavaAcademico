// Tadeu Espíndola Palermo - Terceiro Semestre - Introdução à Orientação a Objetos
package br.com.tadeuespindolapalermo;

public class Principal {

	public static void main(String[] args) {
		
		int idade;
		int freqMaxima;
		int freqAlvo[];
		
		BatimentosCardiacos bc = new BatimentosCardiacos("Tadeu", "Espíndola Palermo",
				16, 9, 1985);
		
		idade = bc.calcularIdade(2017);
		freqMaxima = bc.calcularFrequenciaCardiacaMaxima();
		freqAlvo = bc.calcularFrequenciaCardiacaAlvo();
		
		System.out.println("A idade de " + bc.getNome() + " é de: " + idade + " anos.");
		System.out.println("A frequência MÁXIMA de " + bc.getNome() + " é de: " +  freqMaxima + ".");
		System.out.println("A frequência ALVO de " + bc.getNome() + " é de: " + freqAlvo[0] 
				+ " até " + freqAlvo[1] + ".");			
	}
}