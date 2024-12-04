package exerciciosLacosRepeticao;

import java.util.Scanner;

public class ExercicioDoWhile {

	public static void main(String[] args) {
		
		int numero;
		int total = 0;
		
		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("\nDigite um número: ");
            numero = leia.nextInt();
            
            if (numero > 0) {
            	total = total + numero ;}
                        
		} while (numero != 0);
		
        System.out.println("\nA soma dos números positivos é igual a: " + total);

	}	
}