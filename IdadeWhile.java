package atividadePratica;

import java.util.Scanner;

public class IdadeWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int idade = 0,idade1=0,idade2=0;
		
		
		
		
		while(idade>=0) {
			
			System.out.println("\n Digite uma idade: ");
			idade = leia.nextInt();
			
			
			if(idade1>21 && idade1<=0) {
				idade1++;
				
			}else if (idade2<50) {
				idade2++;
				
			}
			
			

}
		System.out.println("\n O numero de pessoas menores de 21: "+idade1);
		System.out.println("\n O numero de pessoas menores de 50: "+idade2);
}
}


