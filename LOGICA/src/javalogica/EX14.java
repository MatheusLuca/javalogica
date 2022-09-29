package javalogica;

import java.util.Locale;
import java.util.Scanner;

public class EX14 {
	
	public static void main(String[] args) {
	

	
	Locale.setDefault(Locale.US);
	double numero;

	Scanner num = new Scanner(System.in);

	System.out.println("Insira um valor para descobrir o intervalo ([0,25], (25,50], (50,75], (75,100])");
	numero = num.nextDouble();

	double compara = intervalo(numero);

	}

public static double intervalo(double a) {

	double resultadoComparacao = 0;

	if (a <= 0 && a <= 25) {

		resultadoComparacao = a;
		System.out.println("numero esta no intervalo [0,25] ");
		return resultadoComparacao;
	}

	else if (a > 25 && a <= 50) {

		resultadoComparacao = a;
		System.out.println("numero esta no intervalo (25,50] ");
		return resultadoComparacao;
	}

	else if (a >= 75 && a < 50) {

		resultadoComparacao = a;
		System.out.println("numero esta no intervalo (50,75] ");
		return resultadoComparacao;
	}

	else if (a > 75 && a < 100) {

		resultadoComparacao = a;
		System.out.println("numero esta no intervalo (75,100] ");
		return resultadoComparacao;
	}
	
	else {
		
		System.out.println("fora do intervalo");
		return resultadoComparacao;
	}

}

}