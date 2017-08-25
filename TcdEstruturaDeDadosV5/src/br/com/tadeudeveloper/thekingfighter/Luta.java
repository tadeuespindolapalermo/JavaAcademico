package br.com.tadeudeveloper.thekingfighter;
import java.util.Random;

public class Luta {
	
	// Atributos
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	// Métodos Púlicos	
	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
		} else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}		
	}
	
	public void lutar() {
		if (this.aprovada) {
			System.out.println("----------------------------------------------------");
			System.out.println("                  NOVA LUTA APROVADA!               ");
			System.out.println("----------------------------------------------------");			
			System.out.println("                   ### DESAFIADO ###                ");
			this.desafiado.apresentar();
			System.out.println();
			System.out.println("----------------------------------------------------");
			System.out.println("                   ### DESAFIANTE ###               ");
			this.desafiante.apresentar();	
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3); // 0, 1, 2
			
			System.out.println();
			System.out.println("=============== RESULTADO DA LUTA =================");
			switch(vencedor) {			
				case 0: // Empate
					System.out.println("Empate entre " + this.desafiado.getNome() + " e " + this.desafiante.getNome() + " !");
					this.desafiado.empatarLuta();
					this.desafiante.empatarLuta();
					break;
				case 1: // Desafiado Vence
					System.out.println("Grande vitória do lutador " + this.desafiado.getNome() + " !!!");
					this.desafiado.ganharLuta();
					this.desafiante.perderLuta();
					break;
				case 2: // Desafiante Vence
					System.out.println("Grande vitória do lutador " + this.desafiante.getNome());
					this.desafiante.ganharLuta();
					this.desafiado.perderLuta();
					break;
			}	
			System.out.println("===================================================");
			System.out.println();
		} else {
			System.out.println("A NOVA LUTA MARCADA NÃO FOI APROVADA!");
			System.out.println();
			System.out.println("As exigências necessárias são incompatíveis!");
			System.out.println("Os lutadores selecionados são iguais ou não possuem a mesma categoria.");
		}		
	}

	// Métodos Especiais Getters e Setters
	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean getAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
}