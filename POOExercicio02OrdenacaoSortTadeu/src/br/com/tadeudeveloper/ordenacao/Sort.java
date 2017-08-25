package br.com.tadeudeveloper.ordenacao; // pacote do projeto

public class Sort {	// classe Sort (para ordenação do vetor)
	
	private int i,j,aux; // atributos i, j e aux declarados como tipo primitivo int
	
	public int[] sort(int[] vetor) { // método público chamado sort que além de retornar, recebe como parâmetro um vetor de inteiros		
		 		
		String mostra = "Vetor desordenado:\n|"; // string "Vetor desordenado: |" armazenada na variável mostra do tipo classe String
		
		for(i=0; i < vetor.length; i++) {	     // laço for que percorre o vetor. Enquanto o valor da variável i que inicializa com 0 for menor que o tamanho do vetor, incremente a variável i				
			mostra += vetor[i]+ " | ";           // string mostra recebe o valor dela mesma (texto) mais o valor da posição i do vetor concatenado com "|"
		}
		
		// bloco de código responsável pela ordenação do vetor
		for(i=0; i < vetor.length; i++) {     // laço for que percorre o vetor. Enquanto o valor da variável i que inicializa com 0 for menor que o tamanho do vetor, incremente a variável i
			for(j=0; j < vetor.length; j++) { // laço for que percorre o vetor. Enquanto o valor da variável j que inicializa com 0 for menor que o tamanho do vetor, incremente a variável j
				if(vetor[i] < vetor[j]) {     // verifica se o valor da posição i é menor do que o valor da posição j
					aux = vetor[i];           // variável auxiliar recebe o valor da posição i
					vetor[i] = vetor[j];      // troca de valores dos índices do vetor: posição i recebe valor da posição j
					vetor[j] = aux;           // troca de valores dos índices do vetor: posição j recebe valor da posição aux que recebeu o valor da posição i
				}				
			}			
		}
		
		mostra += "\n\nVetor ordenado\n|";   // variável mostra recebe o valor dela mesma mais o valor: Vetor ordenado |
		for(i=0; i < vetor.length; i++) {    // laço for que percorre o vetor. Enquanto o valor da variável i que inicializa com 0 for menor que o tamanho do vetor, incremente a variável i
			mostra += vetor[i]+ " | ";	     // variável mostra recebe o valor dela mesma mais o valor da posição i do vetor + "|"
		}		System.out.println();
		
		System.out.println(mostra);          // imprime no console o valor da variável mostra		
		return vetor;                        // retorna o valor do vetor informado no parâmetro no método 		
	}
}