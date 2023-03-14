package atividadePratica;

import java.util.Scanner;

public class CalculoMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float nota1,nota2,nota3,nota4;
		
		Scanner leia = new Scanner(System.in);
		

		System.out.printf("\n Entre com a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.printf("\n Entre com a segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.printf("\n Entre com a terceira nota: ");
		nota3 = leia.nextFloat();
		System.out.printf("\n Entre com a quarta nota:");
		nota4 = leia.nextFloat();
		
		double media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.printf("Sua média final é: %.1f ",media);

	}

}
