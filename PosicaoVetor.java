package atividadePratica;

import java.util.Scanner;

public class PosicaoVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] vetor = {2,5,1,3,4,9,7,8,10,6};
		int numero,x;
		
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\n Digite o número que você quer encontrar: ");
		numero = leia.nextInt();
		
		for(x=0;x<10;x++) {
			
			if (vetor[x]==numero) {
				
			System.out.println("\n O número "+numero+" está localizado na posição: "+x);
			break;
		
			
			}
			
			
			
		
	
		

	}if (numero>10) {
		
		System.out.println("O número "+numero+" não foi encontrado!");
	
}  
	

}
}
