package javalogica;

import java.lang.Character.UnicodeScript;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Ex06 {

	
	// 25) Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e
	//escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior
	//ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'. 
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		double numeroConta, saldoConta, debito, credito, saldoAtual = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Conta Bancária: \n");
		
		System.out.println("Insira o numero da conta: ");
		numeroConta = input.nextDouble();
		
		System.out.println("Saldo: ");
		saldoConta = input.nextDouble();
		
		System.out.println("Débito: ");
		debito = input.nextDouble();
		
		System.out.println("credito: ");
		credito = input.nextDouble();
		
		
		saldoAtual = saldoConta - debito + credito;
		
			if ( saldoAtual > 0) {
				
				System.out.println("Saldo da conta" + numeroConta + "positivo no valor de: " + saldoAtual);
				
			}
			
			else {
				
				System.out.println("Saldo da conta" + numeroConta + "negativo no valor de:  " + saldoAtual);
				
			}
		
		
	}
}
