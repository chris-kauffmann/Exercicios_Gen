package atividadePratica;

import java.util.Scanner;

public class SomaPositivosDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int numero,soma=0,media=0,cont=0;
		
		
		do{

			System.out.print("\n Digite um número: \n(Caso deseje encerrar digite 0)");
			numero = leia.nextInt();
			
			if(numero % 3 ==0 && numero!=0) {
				soma = soma + numero;
				cont++;
				
				
			}
		}while(numero!=0);
		
		media = soma/cont;
		System.out.println("\n A média de todos os número múltiplos de 3 é:  "+media);

	}

}
