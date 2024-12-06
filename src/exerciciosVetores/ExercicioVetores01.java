package exerciciosVetores;

import java.util.Scanner;

public class ExercicioVetores01 {

	public static void main(String[] args) {

		int numeros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int pesquisa;
		boolean encontrado = false;
		int indice;

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número que você encontrar: ");
		pesquisa = leia.nextInt();

		for (indice = 0; indice < 10; indice++) {
			if (numeros[indice] == pesquisa) {
				System.out.println("Número " + pesquisa + " está localizdo na posição " + indice);
			encontrado = true;
			break;
			}
		}
			if (!encontrado) {
				System.out.println("\nO número " + pesquisa + " não foi encontrado!");

			}
		}

	}

