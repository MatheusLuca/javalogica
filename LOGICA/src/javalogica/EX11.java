package javalogica;

import java.util.Scanner;

public class EX11 {

	public static void main(String[] args) {

	
		//Escreva um programa que imprima todos os números de 1 até 100, inclusive, e a soma
		//de todos eles.
		
		
		int contador, soma = 0;
		
		
			for (contador = 0; contador <= 100; contador++) {
				
				
				System.out.println(contador);
				
				// 0 + 0 = soma
				
				soma = soma + contador;
				
				
				
			}
		
			System.out.println(soma);
	}
}


