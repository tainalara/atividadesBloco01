package exerciciosEstruturaDeDados;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Stack<String> livros = new Stack<String>();
		int opcao;
		
		do {
			System.out.println("\nEscolha o número correspondente ao serviço no MENU abaixo:");
			System.out.println("\n************************** MENU **************************");
			System.out.println("\n          1 - Adicionar Livro na pilha");
			System.out.println("          2 - Listar todos os livros");
			System.out.println("          3 - Retirar livro da pilha");
			System.out.println("          0 - Sair");
			System.out.println("\n***********************************************************");

			System.out.println("\nDigite a opção desejada:");
			opcao = leia.nextInt();
			leia.nextLine();
			
			switch (opcao) {
			case 1: 
				System.out.println("\nDigite o nome do livro: ");
				String titulo = leia.nextLine();
				livros.push(titulo);
				Iterator<String> listax = livros.iterator();
				System.out.println("\nPilha:");
				while (listax.hasNext()) {
					System.out.println(listax.next());
				}				
				break;
			case 2:
				if (livros.isEmpty()) {
				System.out.println("\nA pilha de livros está vazia!");
				} else {
					System.out.println("\nPilha:");
					Iterator<String> lista = livros.iterator();
					while (lista.hasNext()) {
						System.out.println(lista.next());
					}
				}
				break;
			case 3:
				if (livros.isEmpty()) {
					System.out.println("\nA pilha de livros está vazia!");		
				} else {
					System.out.println("\nO livro '" + livros.pop() + "' foi retirado da pilha");
					Iterator<String> lista = livros.iterator();
					System.out.println("\nPilha:");
					while (lista.hasNext()) {
						System.out.println(lista.next());
					}
		}
				break;
				
			}
			
		} while (opcao != 0); {
			System.out.println("O programa foi encerrado");
		}
		
		
	}

}
