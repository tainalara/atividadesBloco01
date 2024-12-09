package exerciciosEstruturaDeDados;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila01 {

	public static void main(String[] args) {

		Queue<String> clientes = new LinkedList<String>(); 
		
		Scanner leia = new Scanner(System.in);
		int opcao;
		
		do {

		System.out.println("\n******************** MENU ********************");
		System.out.println("\nEscolha o número correspondente ao serviço no MENU");
		System.out.println("\n\n          1 - Adicionar Cliente na Fila");
		System.out.println("          2 - Listar Todos os Clientes");
		System.out.println("          3 - Retirar Cliente da Fila");
		System.out.println("          0 - Sair");
		System.out.println("\n**********************************************");

		System.out.println("\nDigite a opção desejada:");
		opcao = leia.nextInt();
		leia.nextLine();
		
		switch (opcao) {
			case 1:
				System.out.println("Digite o nome: ");
	            String nome = leia.nextLine();
				clientes.add(nome);
				System.out.println("\nCliente adicionado com sucesso!");
				Iterator<String> listax = clientes.iterator();
				System.out.println("\nFila:");
				while (listax.hasNext()) {
					System.out.println("\n" + listax.next());
				}				
				break;

			case 2:
				if (clientes.isEmpty()) {
					System.out.println("\nA fila está vazia");		
				} else {
					System.out.println("\nFila:");
					Iterator<String> lista = clientes.iterator();
					while (lista.hasNext()) {
						System.out.println("\n" + lista.next());
					}
				}
				break;
				
			case 3: 
				if (clientes.isEmpty()) {
					System.out.println("\nA fila está vazia");		
				} else {
					System.out.println("\nCliente " + clientes.poll() + " foi chamado(a)!");
					Iterator<String> lista = clientes.iterator();
					System.out.println("\nFila:");
					while (lista.hasNext()) {
						System.out.println("\n" + lista.next());
					}
		}
				break;
	}
		} while (opcao != 0); {
			System.out.println("\nPrograma Finalizado");
		}
		
}
}
