package atividadePratica;

import java.util.Scanner;

public class ValoresIntIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		int valor1,valor2,valor3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Entre com o primeiro valor: ");
		valor1 = leia.nextInt();
		System.out.println("\n Entre com o segundo valor: ");
		valor2 = leia.nextInt();
		System.out.println("\n Entre com o terceiro valor: ");
		valor3 = leia.nextInt();
		
		
		if(valor1+valor2>valor3) {
			
			System.out.println("A soma de "+valor1+" + "+valor2+" é maior do que "+valor3);
		
		}else if(valor1+valor2<valor3) {
			
			System.out.println("A soma de "+valor1+" + "+valor2+" é menor do que "+valor3);
		
		}else {
			
			System.out.println("A soma de "+valor1+" + "+valor2+" é igual a "+valor3);
		}
		
		
		
		

	}

}
