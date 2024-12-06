
package exerciciosVetores;

import java.util.Scanner;

public class ExercicioVetores02 {

	public static void main(String[] args) {

		int numeros[] = new int[10];
		int indice;
		int soma = 0; 
		double media = 0;

		Scanner leia = new Scanner(System.in);

		// Entrada de dados
		for (indice = 0; indice < 10; indice++) {
			System.out.println("Digite o " + (indice + 1) + "º número:");
			numeros[indice] = leia.nextInt();

		}

		// Processamento e saída de dados
		System.out.print("\nEsses são os números ímpares: ");
		for (indice = 0; indice < 10; indice++) {
			if (numeros[indice] % 2 != 0) {
				System.out.print((numeros[indice]) + " ");
			}
		}

		System.out.print("\nEsses são os números pares: ");
		for (indice = 0; indice < 10; indice++) {
			if (numeros[indice] % 2 == 0) {
				System.out.print((numeros[indice]) + " ");
			}
		}

		for (indice = 0; indice < 10; indice++) {
			soma = soma + numeros[indice];}
		
		media = (double) soma/10;

		System.out.println("\nA soma de todos os números inseridos é: " + soma);
		System.out.printf("A média de todos os números inseridos é: " + media);
		}
	}
