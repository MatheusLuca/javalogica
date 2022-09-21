package javalogica;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		
		
	// Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive). Considere
	//que o N será sempre maior que ZERO. 
		
		
		
		int n;
		int i = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um numero inteiro entre 1 e N numeros: ");
		n = sc.nextInt();
		
		while ( i < n ) {
			i++;
			
			System.out.println(i);
			
		}
		
	}
}
