package javalogica;

import java.util.Iterator;

public class Ex09 {

	//Escreva um algoritmo que imprima as seguintes seqüências de números: (1, 1 2 3 4 5 6 7 8 9 10)
	//(2, 1 2 3 4 5 6 7 8 9 10) (3, 1 2 3 4 5 6 7 8 9 10) (4, 1 2 3 4 5 6 7 8 9 10) e assim sucessivamente, até
	//que o primeiro número (antes da vírgula), também chegue a 10. 
	
	public static void main(String[] args) {
		
		int   numVirgula; int numConjunto = 1;
		
		for (numVirgula = 1; numVirgula <= 10; numVirgula++ ) {
			
			
			
			for ( numConjunto = 1; numConjunto <= 10; numConjunto++ ) {
				
				
				System.out.printf("(" + numVirgula + "()" + "." + numConjunto +"");

				
				
			}
			
			
		}
		
		
	}
	
}
