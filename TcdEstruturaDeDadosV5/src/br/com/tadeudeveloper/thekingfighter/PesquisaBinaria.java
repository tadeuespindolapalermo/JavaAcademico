package br.com.tadeudeveloper.thekingfighter;
public class PesquisaBinaria {
		
		private long[] ar; // Array de elementos

		private int nElementos; // Número de elementos

		/**
		 * Construtor - Define o tamanho da matriz pelo usuário
		 * @param max
		 */
		
		public PesquisaBinaria(int max) {
			ar = new long[max]; // Cria o array de elementos
			nElementos = 0;
		}
		
		public long[] getAr() {
			return ar;
		}
		
		public void setAr(long[] ar) {
			this.ar = ar;
		}

		/**
		 * Método para adicionar um elemento no final do array
		 * @param valor
		 */
		
		public void inserir(long valor) { // Adiciona o elemento no final do array
			ar[nElementos] = valor; 	// Insere o elemento
			nElementos++; 			// Incrementa o tamanho do array
		}

		/**
		 * Método para exibir o conteúdo da matriz
		 */
		
		public void exibir() { // Exibe o conteúdo da matriz
			for (int j = 0; j < nElementos; j++) // para cada elemento,
				System.out.print(ar[j] + " "); // Exibe o elemento
			System.out.println("");
		}

		/**
		 * Algoritmo da Troca de Valores
		 * @param elemento
		 * @param proximoElemento
		 */
		
		private void trocar(int elemento, int proximoElemento) { // Algoritmo da Troca de Elementos
			long temp = ar[elemento];
			ar[elemento] = ar[proximoElemento];
			ar[proximoElemento] = temp;
		}
		
		/**
		 * Algoritmo de ordenação Bobble Sort		 
		 */
		
		public void bubbleSort() { // ALGORITMO BUUBLE SORT!!!
			int externo, interno;

			for (externo = nElementos - 1; externo > 0; externo--) // Loop externo (esquerda para direita)
				for (interno = 0; interno < externo; interno++) // Loop interno (direita para esquerda)
					if (ar[interno] > ar[interno + 1]) // Esta fora da ordem?
						trocar(interno, interno + 1); // Troca de posições
		}	

		/**
		 * Algoritmo de Pesquisa Binária
		 */		

		public int BuscaBinaria(int pesquisado) {			
			
			int meio;
			int inicio = 0;		
			int fim = ar.length -1;
			
			while (inicio <= fim) {
				meio = (inicio + fim) / 2;
				if (ar[meio] == pesquisado)
					return meio;
				else if (ar[meio] < pesquisado) inicio = meio + 1;										
				else if (ar[meio] > pesquisado) fim = meio - 1;																
			}
			System.out.println("PESQUISA BINÁRIA sendo efetuada... aguarde " );
			return -1;
		}		
	}