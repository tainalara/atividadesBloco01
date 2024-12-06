package exerciciosCollections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExercicioCollection03 {

	public static void main(String[] args) {
		
		//Variaveis
		int numero;

		Set<Integer> numeros = new HashSet<Integer>();
		
		Scanner leia = new Scanner(System.in);
		
		for( int contador = 1; contador <=10; contador++) {
			
			System.out.println("\nDigite a " + contador + "º número: \n*evite números repetidos*");
			numero = leia.nextInt(); 
			
			numeros.add(numero);

		}
		

		System.out.println("\nListar dados do Set:");

		for(Integer lista : numeros) {
			System.out.println(lista);
		}
	}

}
