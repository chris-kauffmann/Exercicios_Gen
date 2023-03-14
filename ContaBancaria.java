package atividadePratica;

import java.util.Scanner;

public class ContaBancaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float salario;
		float abono;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Entre com o valor do seu salário:R$ ");
		salario = leia.nextFloat();
		System.out.println("\n Entre com o valor do seu abono:R$ ");
		abono = leia.nextFloat();
		
		
		double novosalario = (salario+abono);
		
		System.out.printf("\n Seu novo salário é:R$%.2f",novosalario);
		

	}

}
