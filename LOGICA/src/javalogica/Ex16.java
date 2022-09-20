package javalogica;

import java.util.Scanner;

public class Ex16 {
	
	// Escreva um programa para gerar o invertido de um número com três algarismos 
	//(exemplo: o invertido de 498 é 894).
	
	public static void main(String[] args) {
		
		System.out.println(" Escreva um programa para gerar o invertido de um número com três algarismos \r\n"
				+ "(exemplo: o invertido de 498 é 894).");
		
		int unidade;
		int dezena;
		int centena;
		
		System.out.println("Insira unidade/dezena/centena nesta ORDEM");
		Scanner unidades = new Scanner(System.in);
		
		unidade = unidades.nextInt();
		dezena = unidades.nextInt();
		centena = unidades.nextInt();
		
			if (unidade <= 9 && dezena <= 9 && centena <= 9) {
				
				
				System.out.println("numero digitado é " + unidade + dezena + centena );
			
				System.out.println(" o invertido do numero digitado é " + centena + dezena + unidade);
				
			}
		
			else {
				
				System.out.println("valores para unidade ou dezena ou centena estão errados");
				
			}
		
	}
}