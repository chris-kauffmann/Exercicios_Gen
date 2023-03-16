package atividadePratica;

import java.util.Scanner;

public class ContaBankSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		Scanner leia = new Scanner(System.in);
		
		float saldo = 1000;
		float saque,deposito,total;
		
		int op;
		
		System.out.println("\n\t\t Operações Disponíveis");
		System.out.println("\n 1- Saldo");
		System.out.println("\n 2- Saque");
		System.out.println("\n 3- Depósito");
		System.out.println("\n Digite a operação que deseja realizar: ");
		op = leia.nextInt();
		
		switch(op) {
		
		case 1:
			System.out.println("O valor do seu saldo é: R$"+saldo);
			break;
			
		case 2:
			
			
			System.out.println("\n Digite o valor que deseja sacar:");
			saque = leia.nextFloat();
			
			
		
			if (saque<saldo) {
				total = saldo-saque;
				
				System.out.println("\n O seu novo total é de: R$"+total);
				
			}else {
				
				System.out.println("\n Saldo Insuficiente");
			}
			break;
		
		case 3:
			
		    System.out.println("\n Digite o valor que deseja depositar:");
			deposito = leia.nextFloat();
			
			 total = saldo+deposito;
			
			System.out.println("\nO seu novo total é de: R$"+total);
		
			break;
		}
		

	}

}
