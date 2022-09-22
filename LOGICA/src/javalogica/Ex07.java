package javalogica;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		// Um posto está vendendo combustíveis com a seguinte tabela de descontos:
		// até 20 litros, desconto de 3% por litro Álcool
		// acima de 20 litros, desconto de 5% por litro
		// até 20 litros, desconto de 4% por litro Gasolina
		// acima de 20 litros, desconto de 6% por litro
		// Escreva um algoritmo que leia o número de litros vendidos e o tipo de
		// combustível (codificado da
		// seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago
		// pelo cliente sabendo-se
		// que o preço do litro da gasolina é R$ 3,30 e o preço do litro do álcool é R$
		// 2,90.

		double litro;
		char c = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("Calculo Preço do Combustivel");

		System.out.println("Digite 'g' para gasolina || 'a' para alcool");
		c = input.next().charAt(c);

		System.out.println("Insira a quantidade de litros: ");
		litro = input.nextDouble();

		switch (c) {

		case 'a':

			System.out.println("Opção escolhida foi 'Alcool'");

			if (litro <= 20) {

				double precoFinal;

				System.out.println("Litro menor ou igual a vinte | DESCONTO DE 3%");

				precoFinal = (litro * 2.9) * 0.97;

				System.out.printf("Total a pagar %.3f", precoFinal);
			}

			else {

				double precoFinal;

				System.out.println("Litro menor ou igual a vinte | DESCONTO DE 5%");

				precoFinal = (litro * 2.9) * 0.95;

				System.out.printf("Total a pagar %.3f", precoFinal);

			}

			break;

		case 'g': {

			System.out.println("Opção escolhida foi 'Gasolina'");

			if (litro <= 20) {

				double precoFinal;

				System.out.println("Litro menor ou igual a vinte | DESCONTO DE 4%");

				precoFinal = (litro * 3.3) * 0.96;

				System.out.printf("Total a pagar %.3f", precoFinal);
			}

			else {

				double precoFinal;

				System.out.println("Litro maior que vinte | DESCONTO DE 6%");

				precoFinal = (litro * 3.3) * 0.94;

				System.out.printf("Total a pagar %.3f", precoFinal);
				
			}

		}

		}
	}
}
