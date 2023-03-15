package atividadePratica;

import java.util.Scanner;

public class PositivoOuNegativoIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Digite um número inteiro: ");
		numero = leia.nextInt();
		
		
		
		if (numero % 2==0 && numero>=0) {
			
			System.out.println("\n O número "+numero+" é par e positivo!!");
			
		}else if (numero % 2==0 && numero<0) {
			
			System.out.println("\n O número "+numero+" é par e negativo" );
			
		}else if (numero % 1==0 && numero>=0){
			
			System.out.println("\n O número "+numero+" é ímpar e posivito");
			
		}else {
			
			System.out.println("\n O número "+numero+" é ímpar e negativo");
		}
		

	}

}
