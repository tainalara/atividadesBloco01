package exerciciosCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioCollection02 {

	public static void main(String[] args) {
		
		ArrayList <Integer> numeros = new ArrayList <Integer>();
		Scanner leia = new Scanner(System.in);
		
		numeros.add (2);
		numeros.add (5);
		numeros.add (1);
		numeros.add (3);
		numeros.add (4);
		numeros.add (9);
		numeros.add (7);
		numeros.add (8);
		numeros.add (10);
		numeros.add (6);
		
		System.out.println("Digite o número que você deseja encontrar: "); 
		Integer numero = leia.nextInt(); 
		
		int numeroInesistente = numeros.indexOf(numero);
		
		if (numeroInesistente == -1) {
			System.out.println("\nO número " + numero + " não foi localizado!");
		} else  {
			System.out.println("\nO número " + numero + " está localizado na posição: " + numeros.indexOf(numero));
			}
	}
}
		
		
		
		
