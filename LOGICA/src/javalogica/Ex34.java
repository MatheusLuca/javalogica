package javalogica;

import java.util.Locale;
import java.util.Scanner;



public class Ex34 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
			//Uma financeira usa o seguinte critério para conceder empréstimos:
		     // o valor total do empréstimo deve ser até dez vezes o valor da renda mensal
			//o valor da prestação deve ser no máximo 30% da renda mensal do solicitante.
		     //Escreva um programa 
			//que leia a renda mensal de um solicitante, o valor total do empréstimo solicitado e o 
			//número de prestações que o solicitante deseja pagar e informe se o empréstimo pode ou 
			//não ser concedido.
		
			double valor_emprestimo, renda_mensal, qtd_parcela;
			
			System.out.println("Calculo para conceder emprestimo\n");
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Insira a renda mensal: ");
			renda_mensal = sc.nextDouble();
			
			System.out.println("valor do empréstimo: ");
			valor_emprestimo = sc.nextDouble();
			
			System.out.println("numero de parcelas: ");
			qtd_parcela = sc.nextDouble();
		
			double verificarenda, renda_trintaporcento;
			double verificaprestacao;
			
			verificarenda = renda_mensal * 10; // 10 x o salario dele
			
			renda_trintaporcento = renda_mensal * 0.3; // valor maximo de 30% da renda
			
			verificaprestacao = valor_emprestimo / qtd_parcela;// total do valor de cada parcela
			
			if(renda_mensal <= verificarenda && verificaprestacao <= renda_trintaporcento) {
				
				System.out.println("Critéiro renda até 10x maior que a renda mensal: APROVADO");
				System.out.println("Critério valor parcela menor que 30% da renda mensal: APROVADO");

			}
			
			else {
				
				System.out.println("Empréstimo NAO APROVADO");
				
			}
		
	}
}