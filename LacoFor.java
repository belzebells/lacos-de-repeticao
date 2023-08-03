package javatech;

import java.util.Scanner;

public class LacoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		int numero, x, contapar = 0, contaimpar = 0;

		for (x = 1; x <= 10; x++) {

			System.out.println("\nescreva um número: ");
			numero = leia.nextInt();

			if (numero % 2 == 0) {
				contapar++;

			} else {
				contaimpar++;

			}

		}
		System.out.println("\nnúmero total de pares: " + contapar);
		System.out.println("\nnúmero total de ímpares: " + contaimpar);

		leia.close();
	}
}