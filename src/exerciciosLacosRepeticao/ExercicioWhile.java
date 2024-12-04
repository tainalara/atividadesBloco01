package exerciciosLacosRepeticao;

import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {
		
		int idade, menores = 0, maiores = 0; 
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite uma idade: ");
		idade = leia.nextInt();

		while (idade >= 0) {
			
			if (idade <=21) {
				menores++; 
			}
			
			else if (idade >= 50) {
				maiores++; 
			}
			
		System.out.println("\nO total de pessoas menores de 21 anos é de: " + menores);
		System.out.println("O total de pessoas maiores de 50 anos: " + maiores);

			
		System.out.println("\nDigite uma idade: ");
		idade = leia.nextInt();
		
		}
		
		System.out.println("\nVocê digitou uma idade inválida / Programa encerrado.");
        System.out.println("O total de pessoas menores de 21 anos é de: " + menores);
        System.out.println("O total de pessoas maiores de 50 anos é de: " + maiores);

		}
	}

