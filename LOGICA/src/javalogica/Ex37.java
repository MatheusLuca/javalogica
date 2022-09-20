package javalogica;

import java.util.Locale;
import java.util.Scanner;

//Uma Cia de pulverização utiliza avião para pulverizar lavouras. Os custos de 
//pulverização dependem do tipo de praga e da área a ser contratada conforme a tabela:
//Tipo 1 – ervas daninhas R$ 50,00 por acre;
//Tipo 2 – gafanhotos R$ 100,00 por acre;
//Tipo 3 – broca R$ 150,00 por acre;
//Tipo 4 – todos acima R$ 250,00 por acre.
//Se a área a ser pulverizada for superior a 1000 acres, o fazendeiro tem um desconto de 
//5%. Em adição, qualquer fazendeiro cujo custo for maior do que R$ 750,00 tem um 
//desconto de 10% sobre o valor que ultrapassar os R$ 750,00. Caso ambos os descontos se 
//aplicam o da área é calculado antes. Fazer um algoritmo que leia: o tipo de pulverização 
//(1 a 4) e área a ser pulverizada; e imprima o valor a ser pago

public class Ex37 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		double areaPulverizada;
		double ervasDaninha = 50.00, gafanhotos = 100.00, broca = 150.00, outro = 250.00;
		int i;

		Scanner sc = new Scanner(System.in);

		System.out.println("Escolha as opções para calcular o valor da area para pulverização\n");
		System.out.println("Opção 1 Ervas Daninha\n");
		System.out.println("Opção 2 Gafanhotos\n");
		System.out.println("Opção 3 Broca\n");
		System.out.println("Opção 4 Outros\n");
		System.out.println("Digite a area a ser pulverizada (medida em acre)");
		areaPulverizada = sc.nextDouble();
		System.out.println("Com base no menu digite a opção");
		i = sc.nextInt();

		switch (i) {

		case 1: {

			System.out.println("Opção Erva Daninha");

			double precoTotal, descontoPreco, descontoArea;
			double somaDescontos = 0;

			precoTotal = areaPulverizada * ervasDaninha;// preco total area
			descontoPreco = precoTotal;

			descontoPreco = (descontoPreco - 750.00) * 0.90;// desconto mais que 750,00 - 10%
			descontoArea = precoTotal * 0.95; // desconto area - 5%

			somaDescontos = descontoArea + descontoPreco; // preço somando os 2 descontos

			if (areaPulverizada > 1000.00 && precoTotal > 750.00) {

				System.out.println("Conforme descontos o preço final será: " + somaDescontos);
			}

			else if (areaPulverizada > 1000.00) {

				System.out.println("Desconto aplicado apenas na area pulverizada. Preço final" + descontoArea);

			}

			else if (precoTotal >= 750.00) {

				System.out.println("Preço final com desconto apenas no preço é : " + descontoPreco);

			}

			else {

				System.out.println("O Preço final sem descontos é " + precoTotal);
			}

		}

			break;

		case 2: {

			System.out.println("Opção Erva Daninha");

			double precoTotal, descontoPreco, descontoArea;
			double somaDescontos = 0;

			precoTotal = areaPulverizada * gafanhotos;// preco total area
			descontoPreco = precoTotal;

			descontoPreco = (descontoPreco - 750.00) * 0.90;// desconto mais que 750,00 - 10%
			descontoArea = precoTotal * 0.95; // desconto area - 5%

			somaDescontos = descontoArea + descontoPreco; // preço somando os 2 descontos

			if (areaPulverizada > 1000.00 && precoTotal > 750.00) {

				System.out.println("Conforme descontos o preço final será: " + somaDescontos);
			}

			else if (areaPulverizada > 1000.00) {

				System.out.println("Desconto aplicado apenas na area pulverizada. Preço final" + descontoArea);

			}

			else if (precoTotal > 750.00) {

				System.out.println("Preço final com desconto apenas no preço é : " + descontoPreco);

			}

			else {

				System.out.println("O Preço final sem descontos é " + precoTotal);
			}
		}

			break;

		case 3: {

			System.out.println("Opção Erva Daninha");

			double precoTotal, descontoPreco, descontoArea;
			double somaDescontos = 0;

			precoTotal = areaPulverizada * broca;// preco total area
			descontoPreco = precoTotal;

			descontoPreco = (descontoPreco - 750.00) * 0.90;// desconto mais que 750,00 - 10%
			descontoArea = precoTotal * 0.95; // desconto area - 5%

			somaDescontos = descontoArea + descontoPreco; // preço somando os 2 descontos

			if (areaPulverizada > 1000.00 && precoTotal > 750.00) {

				System.out.println("Conforme descontos o preço final será: " + somaDescontos);
			}

			else if (areaPulverizada > 1000.00) {

				System.out.println("Desconto aplicado apenas na area pulverizada. Preço final" + descontoArea);

			}

			else if (precoTotal > 750.00) {

				System.out.println("Preço final com desconto apenas no preço é : " + descontoPreco);

			}

			else {

				System.out.println("O Preço final sem descontos é " + precoTotal);
			}
		}

			break;

		case 4: {

			System.out.println("Opção Erva Daninha");

			double precoTotal, descontoPreco, descontoArea;
			double somaDescontos = 0;

			precoTotal = areaPulverizada * ervasDaninha;// preco total area
			descontoPreco = precoTotal;

			descontoPreco = (descontoPreco - 750.00) * 0.90;// desconto mais que 750,00 - 10%
			descontoArea = precoTotal * 0.95; // desconto area - 5%

			somaDescontos = descontoArea + descontoPreco; // preço somando os 2 descontos

			if (areaPulverizada > 1000.00 && precoTotal > 750.00) {

				System.out.println("Conforme descontos o preço final será: " + somaDescontos);
			}

			else if (areaPulverizada > 1000.00) {

				System.out.println("Desconto aplicado apenas na area pulverizada. Preço final" + descontoArea);

			}

			else if (precoTotal > 750.00) {

				System.out.println("Preço final com desconto apenas no preço é : " + descontoPreco);

			}

			else {

				System.out.println("O Preço final sem descontos é " + precoTotal);
			}
		}

			break;

		}

	}
}
