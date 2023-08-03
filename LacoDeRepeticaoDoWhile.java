package javatech;
import java.util.Scanner;

public class LacoDeRepeticaoDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// lista 03 - laços de repetição do while
		// exercício 5: escreva um algoritmo que leia números inteiros via teclado, até que o número 
		// digitado seja zero. ao final, mostre na tela a soma de todos os números digitados que sejam positivos. 
		// 
		
		int numero = 0;
		int soma = 0; 
		
		Scanner leia = new Scanner(System.in);
				
		do {
		
			System.out.println("\ndigite um número :");
			numero = leia.nextInt();
			
				if(numero > 0)
					soma += numero;
							
		} while(numero != 0); 
			System.out.println("\no total de números positivos é: " + soma);
			soma = leia.nextInt();
		}
	}

