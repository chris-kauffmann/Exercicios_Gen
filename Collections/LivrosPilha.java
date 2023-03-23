package Collections;

import java.util.Scanner;
import java.util.Stack;

public class LivrosPilha {

	public static void main(String[] args) {
		
		Stack <String> pilha = new Stack <String>();
		
		int menuLivros;
		String livro;
		boolean vazia;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("---------------------------------");
		System.out.println("               Menu              ");
		System.out.println("---------------------------------");
		System.out.println("  1 - Adicionar Livro na Pilha   ");
		System.out.println("  2 - Listar todos os Livros     ");
		System.out.println("  3 - Retirar Livro da pilha     ");
		System.out.println("  0 - Sair                       ");
		System.out.println("---------------------------------");
		System.out.println("\n Entre com a opção desejada:   ");
		
		do {
			menuLivros = leia.nextInt();
			
		switch(menuLivros) {
		
		case 1:
			
			System.out.println("\n Digite o nome do livro que deseja adicionar: ");
			leia.nextLine();
			livro = leia.nextLine();
			pilha.push(livro);
			System.out.println("\n Livro adicionado!!");
			
			break;
			
		case 2:
			
			vazia = pilha.isEmpty();
			
			if(vazia) {
				
				System.out.println("\n A Pilha está vazia!!");
				
			}else {
				
				System.out.println("\n Lista de Livros na Pilha: "+pilha);
			}
			
			break;
			
		case 3:
			
			 vazia=pilha.isEmpty();
				
				if(vazia) {
					
					System.out.println("\n A Pilha está vazia!!");
				}else {
					
					pilha.pop();
					System.out.println("\n Um livro foi retirado!!");
				}
				
				break;
				
		case 4:
			
			System.out.println("\n O programa foi finalizado!!");
			
			
		}
			
		}while(menuLivros!=0);
	

	}

}
