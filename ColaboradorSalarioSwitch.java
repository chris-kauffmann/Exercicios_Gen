package atividadePratica;

import java.util.Scanner;

public class ColaboradorSalarioSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		Scanner leia = new Scanner(System.in);
		
		int colabs;
		float salario;
		String nome;
		
		
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();
		System.out.println("Digite o valor do seu salário:");
		salario = leia.nextFloat();
		
		System.out.println("\n\t\t Menu de Cargos");
		System.out.println("\n 1- Gerente");
		System.out.println("\n 2- Vendedor");
		System.out.println("\n 3- Supervisor");
		System.out.println("\n 4- Motorista");
		System.out.println("\n 5- Estoquista");
		System.out.println("\n 6- Técnico de TI");
		System.out.println("\nDigite o número referente a seu cargo:");
		colabs = leia.nextInt();
		
		switch(colabs) {
		
		case 1:
			double reajuste1 = 0.1;
			double novoSalario1 = salario + (reajuste1*salario);
			
			System.out.println("Olá "+nome+" o valor do seu salário com o reajuste é de:R$"+novoSalario1);
			break;
			
		case 2:
			double reajuste2 = 0.07;
			double novoSalario2 = salario + (reajuste2*salario);
			
			System.out.println("Olá "+nome+" o valor do seu salário com o reajuste é de:R$"+novoSalario2);
			break;
		case 3:
			double reajuste3 = 0.09;
			double novoSalario3 = salario + (reajuste3*salario);
			
			System.out.println("Olá "+nome+" o valor do seu salário com o reajuste é de:R$"+novoSalario3);
			break;
		case 4:
			double reajuste4 = 0.06;
			double novoSalario4 = salario + (reajuste4*salario);
			
			System.out.println("Olá "+nome+" o valor do seu salário com o reajuste é de:R$"+novoSalario4);
			break;
		case 5:
			double reajuste5 = 0.05;
			double novoSalario5 = salario + (reajuste5*salario);
			
			System.out.println("Olá "+nome+" o valor do seu salário com o reajuste é de:R$"+novoSalario5);
			break;
		case 6:
			double reajuste6 = 0.08;
			double novoSalario6 = salario + (reajuste6*salario);
			
			System.out.println("Olá "+nome+" o valor do seu salário com o reajuste é de:R$"+novoSalario6);
			break;
							
		default:
			System.out.println("Opção Inválida!!");
		}
		

	}

}
