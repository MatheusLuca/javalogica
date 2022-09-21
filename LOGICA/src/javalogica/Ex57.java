package javalogica;

import java.util.Locale;
import java.util.Scanner;

public class Ex57 {
	
		//O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do
		//distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor
		//seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro,
		//calcular e escrever o custo final ao consumidor. 
	
	public static void main(String[] args) {
	
		double carroNovo, custoFabrica, percentualDistribuidor = 0.28, impostos = 0.45;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calculo do custo Carro novo.");
		custoFabrica = sc.nextDouble();
		
		carroNovo = custoFabrica + ( custoFabrica * percentualDistribuidor) + (custoFabrica * impostos);
		
		System.out.printf("O preço do carro novo | com impostos + distribuidora é %.3f", carroNovo);
		
		
		
		
	}
}

