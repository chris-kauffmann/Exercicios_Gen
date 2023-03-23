package Collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ClientesFila {

	public static void main(String[] args) {
		
		Queue <String> fila = new LinkedList<String>();
		
	    int clientes;
		String cliente;
		boolean vazio;
		
		Scanner leia = new Scanner(System.in); 
			
		System.out.println("---------------------------------");
		System.out.println("               Menu              ");
		System.out.println("---------------------------------");
		System.out.println("  1 - Adicionar Cliente na Fila  ");
		System.out.println("  2 - Listar todos os Clientes   ");
		System.out.println("  3 - Retirar Cliente da Fila    ");
		System.out.println("  0 - Sair                       ");
		System.out.println("---------------------------------");
		System.out.println("\n Entre com a opção desejada:   ");
		
		do {
			clientes = leia.nextInt();
			
			switch(clientes) {
			
			case 1:
				
				System.out.println("\n Digite o nome do cliente que será adicionado: ");
				cliente = leia.next();
				fila.add(cliente);
				System.out.println("Cliente Adicionado!!");
				
				break;
				
			case 2:
				
				vazio =fila.isEmpty();
				
				if(vazio) {
					
					System.out.println("\n A fila está vazia!!");
					
				}else {
					
					System.out.println("\n Lista de Clientes na fila: "+fila);
				}
				
				break;
				
			case 3:
				
				 vazio=fila.isEmpty();
				
				if(vazio) {
					
					System.out.println("\n A fila está vazia!!");
				}else {
					
					fila.poll();
					System.out.println("\n Cliente foi chamado!!");
				}
				
				break;
				
			case 4:
				
				System.out.println("\n O programa foi finalizado!!");
				
				break;
				
			}
			
			
		}while(clientes!=0); {
		
		}
		
		
		
		
		
		
	
	
		
		
	}

}
