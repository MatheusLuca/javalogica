package javalogica;

import java.util.Scanner;

public class EX13 {

	
	public static void main(String[] args) {
		
		int [] crescente = new int [10];
		
		Scanner input = new Scanner(System.in);
		int numero;
		
		for( int i =  0; i < crescente.length; i++) {
			
			System.out.println("Digite o numero " + (i + 1) + "º numero");
			numero = input.nextInt();
			crescente[i] = i;
			
			
		}

		for( numero = 0; numero < crescente.length; numero++  ) {
		
			
		System.out.println(numero);	
		
		
		}
	}
}
