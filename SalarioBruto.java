package atividadePratica;

import java.util.Scanner;

public class SalarioBruto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float salarioBruto,adicional,horaExtra,descontos;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.printf("\n Entre com o valor do seu salário bruto: ");
		salarioBruto = leia.nextFloat();
		System.out.printf("\n Entre com o valor do seu adicional: ");
		adicional = leia.nextFloat();
		System.out.printf("\n Entre com o valor da sua hora extra: ");
		horaExtra = leia.nextFloat();
		System.out.printf("\n Entre com o valor de seu desconto: ");
		descontos = leia.nextFloat();
		
		
		double salarioLiq = (salarioBruto+adicional+(horaExtra*5)-descontos);
		
		System.out.printf("O valor do seu salário liquido é de: R$%.2f",salarioLiq);
		

	}

}
