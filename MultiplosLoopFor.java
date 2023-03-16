package atividadePratica;

import java.util.Scanner;

public class MultiplosLoopFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1,n2;
		int i;
		float multiplo,numero;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Digite o primeiro número: ");
		n1 = leia.nextInt();
		System.out.println("\n Digite o segundo número: ");
		n2 = leia.nextInt();
		
		if (n1<n2) {
			
			for(i=1;i<=100;i++) {
				
				if (i % 3 == 0 && i % 5 == 0) {
				
				System.out.println("\n"+i+" É múltipo de 3 e 5");
					
				}
				
				
			}
		}else {
			System.out.println("\n Intervalo Inválido");
		}
		
		
		
	}
}
		
		
		

	


