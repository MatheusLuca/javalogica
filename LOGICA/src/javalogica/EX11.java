package javalogica;

import java.util.Scanner;

public class EX11 {

	public static void main(String[] args) {

		// Converter um inteiro informado menor que 32 para sua representação em binário

		int numeroFornecido, divisor = 2;
		int resto;
		int contador;

		int vetorResultado[] = new int[4];

		Scanner nf = new Scanner(System.in);

		System.out.println("Insira um numero para menor que 32 para conversão em binário: ");
		numeroFornecido = nf.nextInt();

		if (numeroFornecido <= 32) {

			if (numeroFornecido <= 32) {

				for (resto = 0; resto < divisor; resto++) {

					numeroFornecido = numeroFornecido / divisor;

					resto = numeroFornecido % divisor;
					System.out.println(resto);

				}

			}

		}
	}
}
