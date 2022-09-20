package javalogica;

import java.util.Iterator;
import java.util.Scanner;

//Ler um número inteiro e exibir o seu sucessor

public class Ex05 {
	
	public static void main(String[] args) {
		
		
		System.out.println("Ler um número inteiro e exibir o seu sucessor");
		
		int i = 0;
		
		while( i != -1 ) {
			
			int numero;
			int resultado = 0;
			
			Scanner n = new Scanner(System.in);
			System.out.println("Insira um numero:");
			numero = n.nextInt();
			
			resultado = numero + 1;
			System.out.println("Sucessor do numero escolhido é \t" + resultado);
			
			System.out.println("Digite -1 para parar | ou qualquer outro numero para voltar ao inicio ");
			i = n.nextInt();
			
		}
	}
}

