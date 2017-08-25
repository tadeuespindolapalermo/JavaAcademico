package br.com.tadeudeveloper.crivoeratostenes; 

import java.util.LinkedHashSet; 
import java.util.Set;

public class CrivoEratostenes { 
	
    public Set<Integer> resolver(int num) {
    	
        Set<Integer> resultado = new LinkedHashSet<Integer>();      
        
        if (num > 1) {
            resultado.add(2);                                      // Lista dos possíveis números primos           
            boolean[] naoPrimo = new boolean[num + 1];             // Busca por todos os elementos até a raiz quadrada do máximo e incrementa de dois em dois já que os pares não são primos            
            for (int elemento = 3; elemento <= (int) Math.sqrt(num); elemento += 2) {                 
                if (!naoPrimo[elemento]) {                         // Se ainda não foi eliminado da lista                    
                    int multiplos = elemento + elemento;           // Pega o próximo múltiplo
                    while (multiplos <= num) {                        
                    	naoPrimo[multiplos] = true;                // Se é multiplo, não é primo                        
                        multiplos += elemento;                     // Pego o próximo múltiplo
                    }
                }
            }
            
            // Preenche a lista com todos os números primos
            for (int posicao = 3; posicao <= num; posicao += 2) {
                if (!naoPrimo[posicao]) {
                    resultado.add(posicao);
                }
            }                    
            
        } else {        
        	System.out.println();
			System.out.println("ERRO! Insira um número maior que 1!");	
        }
        
        return resultado; // retorna o objeto resultado       
    }    
}