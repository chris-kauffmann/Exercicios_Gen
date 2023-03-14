package atividadePratica;

import java.util.Scanner;

public class CalculoDiferenca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1,n2,n3,n4;
		
		Scanner leia = new Scanner(System.in);
		

		System.out.printf("\n Entre com o primeiro valor: ");
		n1 = leia.nextFloat();
		System.out.printf("\n Entre com o segundo valor: ");
		n2 = leia.nextFloat();
		System.out.printf("\n Entre com o terceiro valor: ");
		n3 = leia.nextFloat();
		System.out.printf("\n Entre com o quarto valor: ");
		n4 = leia.nextFloat();
		
		
		float calculo = ((n1*n2)-(n3*n4));
		
		System.out.printf("\n A diferença entre os produtos é de: %.2f",calculo);

		
		
		

	}

}
