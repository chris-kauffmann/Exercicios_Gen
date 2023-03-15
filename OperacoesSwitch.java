package atividadePratica;

import java.util.Scanner;

public class OperacoesSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float numero1,numero2;
		int calculadora;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("\n\t\t Menu de Operações:");
		System.out.println("\n 1- Soma");
		System.out.println("\n 2- Subtração");
		System.out.println("\n 3- Multiplicação");
		System.out.println("\n 4- Divisão");
	    System.out.println("\n Escolha qual operação deseja fazer conforme é mostrado no Menu de Operações:");
		calculadora = leia.nextInt();
		System.out.println("\n Digite o primeiro número:");
		numero1 = leia.nextFloat();
		System.out.println("\n Digite o segundo número:");
		numero2 = leia.nextFloat();
		
		switch(calculadora) {
		
		case 1:
			
			float soma = (numero1+numero2);
			System.out.println("A soma dos valores é igual a: "+soma);
			break;
			
		case 2:
			
			float subtracao = (numero1-numero2);
			System.out.println("A subtração dos valores é igual a: "+subtracao);
			break;
		case 3:
			
			float multiplicacao = (numero1*numero2);
			System.out.println("A multiplicação dos valores é igual a: "+multiplicacao);
			break;
		
		case 4: 	
			
			float divisao = (numero1/numero2);
			System.out.println("A divisão dos valores é igual a: "+divisao);
			break;
			
		default:
			
			System.out.println("Digite uma opção válida!!");
		}
			
		
		

	}

}
