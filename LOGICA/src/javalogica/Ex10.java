package javalogica;

import java.util.Scanner;

public class Ex10 {

	//Escreva um programa que calcula o desconto previdenciário de um funcionário. Dado um
	//salário, o programa deve retornar o valor do desconto proporcional ao mesmo. O cálculo
	//segue a regra: o desconto é de 11% do valor do salário, entretanto, o valor máximo de
	//desconto é 334,29, o que seja menor. 
	public static void main(String[] args) {
		
		double salario, salarioDesconto;
		
		Scanner sal = new Scanner(System.in);
		
		System.out.println("Insira o valor do sálario: ");
		salario = sal.nextDouble();
		
		salarioDesconto = salario * 0.11;
		
		if(salarioDesconto <= 334.29) {
			
			
		System.out.println("o desconto baseado no salario informado é : " + salarioDesconto);

		}
		
		else {
			
			System.out.println("o desconto com base no salário ultrapassa o valor permitido de 334,29");
			
		}
		
	}
}
