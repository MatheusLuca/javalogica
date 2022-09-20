package javalogica;

import java.util.Scanner;

public class Ex36 {
	
	public static void main(String[] args) {
		
		//Escreva um programa que receba um numero inteiro de 1 a 100 e mostre na tela o
		//numero por extenso.
		
		int numero, parar = 0;
		String [] unidade = {"zero", "um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove"};
		String [] dezena = {"dez","vinte","trinta","quarenta","cinquenta","sessenta","setenta","oitenta","noventa","cem"};
		String [] especial = {"onze","doze","treze","quatorze","quinze","dezeseis","dezesete","dezeoito","dezenove"};
		
		
		while(parar != 123) {
		
		System.out.println("Digite um numero e tenha o escrito por extenso");
		
		Scanner n = new Scanner(System.in);
		
		numero = n.nextInt();
				
		switch (numero) {
		
			case 0:
				
					System.out.println(unidade[0]);
				
			break;
				
			case 1:
					
					System.out.println(unidade[1]);
					
			break;
			
			case 2:
				
					System.out.println(unidade[2]);
				
				break;
			
			case 3:
				
					System.out.println(unidade[3]);
				
			break;	
				
			case 4:
				
					System.out.println(unidade[4]);
				
			break;
			
			case 5:
				
					System.out.println(unidade[5]);
				
			break;
			
			case 6:
				
					System.out.println(unidade[6]);
				
			break;
			
			case 7:
				
					System.out.println(unidade[7]);
				
			break;
			
			case 8:
				
					System.out.println(unidade[8]);
				
			break;

			case 9:
				
					System.out.println(unidade[9]);
				
			break;
			
			case 10:
				
				System.out.println(dezena[0]);
			
			break;
			
			
			}
		
		switch(numero) {
			
			case 11:
				
				System.out.println(especial[0]);
			
			break;
			
			case 12:
				
				System.out.println(especial[1]);
			
			break;
			
			case 13:
				
				System.out.println(especial[2]);
			
			break;
			
			case 14:
				
				System.out.println(especial[3]);
			
			break;
			
			case 15:
				
				System.out.println(especial[4]);
			
			break;
			
			case 16:
				
				System.out.println(especial[5]);
			
			break;
			
			case 17:
				
				System.out.println(especial[6]);
			
			break;
			
			case 18:
				
				System.out.println(especial[7]);
			
			break;
			
			case 19:
				
				System.out.println(especial[8]);
			
			break;				
			
			}
		
			switch(numero) {

			case 20:
				
				System.out.println(dezena[1]);
			
			break;	
			
			case 30:
				
				System.out.println(dezena[2]);
			
			break;	
			
			case 40:
				
				System.out.println(dezena[3]);
			
			break;	
			
			case 50:
				
				System.out.println(dezena[4]);
			
			break;	
			
			case 60:
				
				System.out.println(dezena[5]);
			
			break;	
			
			case 70:
				
				System.out.println(dezena[6]);
			
			break;	
			
			case 80:
				
				System.out.println(dezena[7]);
			
			break;	
			
			case 90:
				
				System.out.println(dezena[8]);
			
			break;	
			
			case 100:
				
				System.out.println(dezena[9]);
			
			break;	
			
			
			}
		
			
		switch(numero) {
		
		
			case 21:
			
			System.out.println(dezena[1] + " e " + unidade[1]);
		
			break;	
		
			case 22:
				
			System.out.println(dezena[1] + " e " + unidade[2]);
		
			break;	
			
			case 23:
				
			System.out.println(dezena[1] + " e " + unidade[3]);
		
			break;	
			
			case 24:
				
			System.out.println(dezena[1] + " e " + unidade[4]);
		
			break;	
			
			case 25:
				
			System.out.println(dezena[1] + " e " + unidade[5]);
		
			break;	
			
			case 26:
				
			System.out.println(dezena[1] + " e " + unidade[6]);
		
			break;	
			
			case 27:
				
			System.out.println(dezena[1] + " e " + unidade[7]);
		
			break;	
			
			case 28:
				
			System.out.println(dezena[1] + " e " + unidade[8]);
		
			break;	
			
			case 29:
				
			System.out.println(dezena[1] + " e " + unidade[9]);
		
			break;	
		
		}	
			
		switch(numero) {
		
		
		case 31:
		
		System.out.println(dezena[2] + " e " + unidade[1]);
	
		break;	
	
		case 32:
			
		System.out.println(dezena[2] + " e " + unidade[2]);
	
		break;	
		
		case 33:
			
		System.out.println(dezena[2] + " e " + unidade[3]);
	
		break;	
		
		case 34:
			
		System.out.println(dezena[2] + " e " + unidade[4]);
	
		break;	
		
		case 35:
			
		System.out.println(dezena[2] + " e " + unidade[5]);
	
		break;	
		
		case 36:
			
		System.out.println(dezena[2] + " e " + unidade[6]);
	
		break;	
		
		case 37:
			
		System.out.println(dezena[2] + " e " + unidade[7]);
	
		break;	
		
		case 38:
			
		System.out.println(dezena[2] + " e " + unidade[8]);
	
		break;	
		
		case 39:
			
		System.out.println(dezena[2] + " e " + unidade[9]);
	
		break;	
	
	}	
		
		switch(numero) {
		
		
		case 41:
		
		System.out.println(dezena[3] + " e " + unidade[1]);
	
		break;	
	
		case 42:
			
		System.out.println(dezena[3] + " e " + unidade[2]);
	
		break;	
		
		case 43:
			
		System.out.println(dezena[2] + " e " + unidade[3]);
	
		break;	
		
		case 44:
			
		System.out.println(dezena[3] + " e " + unidade[4]);
	
		break;	
		
		case 45:
			
		System.out.println(dezena[3] + " e " + unidade[5]);
	
		break;	
		
		case 46:
			
		System.out.println(dezena[3] + " e " + unidade[6]);
	
		break;	
		
		case 47:
			
		System.out.println(dezena[3] + " e " + unidade[7]);
	
		break;	
		
		case 48:
			
		System.out.println(dezena[3] + " e " + unidade[8]);
	
		break;	
		
		case 49:
			
		System.out.println(dezena[3] + " e " + unidade[9]);
	
		break;	
	
	}	
		
		switch(numero) {
		
		
		case 51:
		
		System.out.println(dezena[4] + " e " + unidade[1]);
	
		break;	
	
		case 52:
			
		System.out.println(dezena[4] + " e " + unidade[2]);
	
		break;	
		
		case 53:
			
		System.out.println(dezena[2] + " e " + unidade[4]);
	
		break;	
		
		case 54:
			
		System.out.println(dezena[4] + " e " + unidade[4]);
	
		break;	
		
		case 55:
			
		System.out.println(dezena[4] + " e " + unidade[5]);
	
		break;	
		
		case 56:
			
		System.out.println(dezena[4] + " e " + unidade[6]);
	
		break;	
		
		case 57:
			
		System.out.println(dezena[4] + " e " + unidade[7]);
	
		break;	
		
		case 58:
			
		System.out.println(dezena[4] + " e " + unidade[8]);
	
		break;	
		
		case 59:
			
		System.out.println(dezena[4] + " e " + unidade[9]);
	
		break;	
	
	}	
		
		switch(numero) {
		
		
		case 61:
		
		System.out.println(dezena[5] + " e " + unidade[1]);
	
		break;	
	
		case 62:
			
		System.out.println(dezena[5] + " e " + unidade[2]);
	
		break;	
		
		case 63:
			
		System.out.println(dezena[5] + " e " + unidade[5]);
	
		break;	
		
		case 64:
			
		System.out.println(dezena[5] + " e " + unidade[5]);
	
		break;	
		
		case 65:
			
		System.out.println(dezena[5] + " e " + unidade[5]);
	
		break;	
		
		case 66:
			
		System.out.println(dezena[5] + " e " + unidade[6]);
	
		break;	
		
		case 67:
			
		System.out.println(dezena[5] + " e " + unidade[7]);
	
		break;	
		
		case 68:
			
		System.out.println(dezena[5] + " e " + unidade[8]);
	
		break;	
		
		case 69:
			
		System.out.println(dezena[5] + " e " + unidade[9]);
	
		break;	
	
	}	
		
		switch(numero) {
		
		
		case 71:
		
		System.out.println(dezena[6] + " e " + unidade[1]);
	
		break;	
	
		case 72:
			
		System.out.println(dezena[6] + " e " + unidade[2]);
	
		break;	
		
		case 73:
			
		System.out.println(dezena[6] + " e " + unidade[3]);
	
		break;	
		
		case 74:
			
		System.out.println(dezena[6] + " e " + unidade[4]);
	
		break;	
		
		case 75:
			
		System.out.println(dezena[6] + " e " + unidade[5]);
	
		break;	
		
		case 76:
			
		System.out.println(dezena[6] + " e " + unidade[6]);
	
		break;	
		
		case 77:
			
		System.out.println(dezena[6] + " e " + unidade[7]);
	
		break;	
		
		case 78:
			
		System.out.println(dezena[6] + " e " + unidade[8]);
	
		break;	
		
		case 79:
			
		System.out.println(dezena[6] + " e " + unidade[9]);
	
		break;	
	
	}	
		
		switch(numero) {
		
		
		case 81:
		
		System.out.println(dezena[7] + " e " + unidade[1]);
	
		break;	
	
		case 82:
			
		System.out.println(dezena[7] + " e " + unidade[2]);
	
		break;	
		
		case 83:
			
		System.out.println(dezena[7] + " e " + unidade[3]);
	
		break;	
		
		case 84:
			
		System.out.println(dezena[7] + " e " + unidade[4]);
	
		break;	
		
		case 85:
			
		System.out.println(dezena[7] + " e " + unidade[5]);
	
		break;	
		
		case 86:
			
		System.out.println(dezena[7] + " e " + unidade[6]);
	
		break;	
		
		case 87:
			
		System.out.println(dezena[7] + " e " + unidade[7]);
	
		break;	
		
		case 88:
			
		System.out.println(dezena[7] + " e " + unidade[8]);
	
		break;	
		
		case 89:
			
		System.out.println(dezena[7] + " e " + unidade[9]);
	
		break;	
	
	}	
		
		
		switch(numero) {
		
		
		case 91:
		
		System.out.println(dezena[8] + " e " + unidade[1]);
	
		break;	
	
		case 92:
			
		System.out.println(dezena[8] + " e " + unidade[2]);
	
		break;	
		
		case 93:
			
		System.out.println(dezena[8] + " e " + unidade[3]);
	
		break;	
		
		case 94:
			
		System.out.println(dezena[8] + " e " + unidade[4]);
	
		break;	
		
		case 95:
			
		System.out.println(dezena[8] + " e " + unidade[5]);
	
		break;	
		
		case 96:
			
		System.out.println(dezena[8] + " e " + unidade[6]);
	
		break;	
		
		case 97:
			
		System.out.println(dezena[8] + " e " + unidade[7]);
	
		break;	
		
		case 98:
			
		System.out.println(dezena[8] + " e " + unidade[8]);
	
		break;	
		
		case 99:
			
		System.out.println(dezena[8] + " e " + unidade[9]);
	
		break;
	
			}	
		
		System.out.println("\n digite 123 para encerrar o programa| ou digite qualquer numero para reiniciar o programa");
		parar = n.nextInt();
		
		}
	}
				
}

