package exerciciosLacosRepeticao;

import java.util.Scanner;

public class ExercicioFor {

	public static void main(String[] args) {
	
		int numero, contador, par = 0, impar = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for(contador = 1; contador < 11; contador++) {
        	System.out.println("Digite o " + contador + "º número: ");
            numero = leia.nextInt(); 
            
            if (numero % 2 == 0 ) {
            	par++;
            }
            
            else {
            	impar++; 
            }           
		}
		 System.out.println("\nTotal de números pares: " + par);
         System.out.println("\nTotal de números ímpares: " + impar);
         

	}

}

	
