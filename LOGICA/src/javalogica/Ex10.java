package javalogica;

import java.util.Scanner;

public class Ex10 {

	//Escreva um programa que calcula o desconto previdenci�rio de um funcion�rio. Dado um
	//sal�rio, o programa deve retornar o valor do desconto proporcional ao mesmo. O c�lculo
	//segue a regra: o desconto � de 11% do valor do sal�rio, entretanto, o valor m�ximo de
	//desconto � 334,29, o que seja menor. 
	public static void main(String[] args) {
		
		double salario, salarioDesconto;
		
		Scanner sal = new Scanner(System.in);
		
		System.out.println("Insira o valor do s�lario: ");
		salario = sal.nextDouble();
		
		salarioDesconto = salario * 0.11;
		
		if(salarioDesconto <= 334.29) {
			
			
		System.out.println("o desconto baseado no salario informado � : " + salarioDesconto);

		}
		
		else {
			
			System.out.println("o desconto com base no sal�rio ultrapassa o valor permitido de 334,29");
			
		}
		
	}
}
