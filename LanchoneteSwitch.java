package atividadePratica;

import java.util.Scanner;

public class LanchoneteSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int lanchonete,quantidade;
		int preco1 = 10, preco2 = 15, preco3 = 18, preco4 = 12, preco5= 8, preco6 = 13;
		
		

		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\t\t Tabela de Produtos");
		System.out.println("\n 1- Cachorro Quente R$10,00 (valor unitário)");
		System.out.println("\n 2- X-Salada R$15,00 (valor unitário)");
		System.out.println("\n 3- X-Bacon R$18,00 (valor unitário)");
		System.out.println("\n 4- Bauru R$12,00 (valor unitário)");
		System.out.println("\n 5- Refrigerante R$8,00 (valor unitário)");
		System.out.println("\n 6- Suco de Laranja R$13,00 (valor unitário)");
		System.out.println("\n Digite o número do produto escolhido: ");
		lanchonete = leia.nextInt();
		
		
		switch(lanchonete) {
		
		case 1:
			System.out.println("\n Produto escolhido: Cachorro quente");
			System.out.println("\n Quantos você vai querer?:");
			quantidade = leia.nextInt();
			
			int valorTotal1 = (quantidade*preco1);
			
			System.out.println("\n O valor total de sua compra é de: R$"+valorTotal1+" reais");
			
			break;
			
		case 2:
			System.out.println("\n Produto escolhido: X-Salada");
			System.out.println("\n Quantos você vai querer?:");
			quantidade = leia.nextInt();
			
			int valorTotal2 = (quantidade*preco2);
			
			System.out.println("\n O valor total de sua compra é de: R$"+valorTotal2+" reais");
			
			break;	
		case 3:
			System.out.println("\n Produto escolhido: X-Bacon");
			System.out.println("\n Quantos você vai querer?:");
			quantidade = leia.nextInt();
			
			int valorTotal3 = (quantidade*preco3);
			
			System.out.println("\n O valor total de sua compra é de: R$"+valorTotal3+" reais");
			
			break;
		case 4:
			System.out.println("\n Produto escolhido: Bauru");
			System.out.println("\n Quantos você vai querer?:");
			quantidade = leia.nextInt();
			
			int valorTotal4 = (quantidade*preco4);
			
			System.out.println("\n O valor total de sua compra é de: R$"+valorTotal4+" reais");
		
	
			break;
		case 5:
			System.out.println("\n Produto escolhido: Refrigerante");
			System.out.println("\n Quantos você vai querer?:");
			quantidade = leia.nextInt();
			
			int valorTotal5 = (quantidade*preco5);
			
			System.out.println("\n O valor total de sua compra é de: R$"+valorTotal5+" reais");
			
			break;
			
		case 6:
			System.out.println("\n Produto escolhido: Suco de Laranja");
			System.out.println("\n Quantos você vai querer?:");
			quantidade = leia.nextInt();
			
			int valorTotal6 = (quantidade*preco6);
			
			System.out.println("\n O valor total de sua compra é de: R$"+valorTotal6+" reais");
			
			break;	
			
		default:
			System.out.println("Selecione uma opção válida");
			
		}
	

		

	}

}
