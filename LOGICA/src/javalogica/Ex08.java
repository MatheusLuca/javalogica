package javalogica;

import java.security.DrbgParameters.NextBytes;
import java.util.Iterator;
import java.util.Scanner;

public class Ex08 {

	//Ler 10 valores, calcular e escrever a média aritmética desses valores lidos. 
	
	public static void main(String[] args) {
		
	
		int contador, n1, n2, n3, n4, n5, n6, n7, n8, n9, n10;
		int Media = 0;
		char comecar = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digita a letra 'S' para calculo da média de 10 numeros");
		comecar = sc.next().charAt(comecar);
		
		while(comecar == 's') {
			
						
			System.out.println("Insira 10 numeros");
			
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			n3 = sc.nextInt();
			n4 = sc.nextInt();
			n5 = sc.nextInt();
			n6 = sc.nextInt();
			n7 = sc.nextInt();
			n8 = sc.nextInt();
			n9 = sc.nextInt();
			n10 = sc.nextInt();
			
			Media = (n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10)/ 10;
			
			System.out.println("media dos 10 numeros" + Media);

			System.out.println("digite 'n' para parar o programa");
			comecar = sc.next().charAt(0);
		}
		

	}
	
}