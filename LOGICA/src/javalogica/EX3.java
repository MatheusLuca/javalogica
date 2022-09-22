package javalogica;

import java.util.Scanner;

public class EX3 {

	public static void main(String[] args) {
		
		//Ler um valor inteiro (aceitar somente valores entre 1 e 10) e escrever a tabuada de 1 a 10 do valor lido. 
		
		int x, y, resultado;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calculo tabuada\n");
		
		System.out.println("Insira a tabuado a ser calculado: ");
		x = sc.nextInt();
		
			for( y = 0; y <= 10; y++ ) {
				
				resultado = x * y;
				
				System.out.println( x + "x" + y + "=" + resultado);
				
				
		}
	}
}
