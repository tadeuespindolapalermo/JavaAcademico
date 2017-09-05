package br.com.tadeudeveloper.guerraninja;

public class Sort {

	private int i,j,aux;

	public int[] sort(int[] vetor) {
		for(i=0; i < vetor.length; i++) {     
			for(j=0; j < vetor.length; j++) { 
				if(vetor[i] < vetor[j]) {     
					aux = vetor[i];          
					vetor[i] = vetor[j];     
					vetor[j] = aux;          
				}				
			}			
		}
		return vetor;                         		
	}
}