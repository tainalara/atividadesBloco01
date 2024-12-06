package exerciciosCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioCollections01 {

	public static void main(String[] args) {
		
		ArrayList <String> cores = new ArrayList <String>();
		Scanner leia = new Scanner(System.in); 
		
		for( int contador = 1; contador <=5; contador++) {
		
		System.out.println("Digite a " + contador + "º cor:");
		String cor = leia.nextLine(); 
		cores.add(cor);
		}
		
		System.out.println("\nLista de todas as cores:" + cores);
		
		cores.sort(null);
		System.out.println("\nOrdenar cores:" + cores);


		;
		
	}

}
