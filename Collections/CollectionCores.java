package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;


public class CollectionCores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cor, cor1,cor2,cor3,cor4;
		
		List<String> cores = new ArrayList<String>();
		
		
			Scanner leia = new Scanner(System.in);
			
			System.out.println("Digite a primeira cor: ");
			cor = leia.nextLine();
			System.out.println("Digite a segunda cor: ");
			cor1 = leia.nextLine();
			System.out.println("Digite a terceira cor: ");
			cor2 = leia.nextLine();
			System.out.println("Digite a quarta cor: ");
			cor3 = leia.nextLine();
			System.out.println("Digite a quinta cor: ");
			cor4 = leia.nextLine();
			
			cores.add(cor);
			cores.add(cor1);
			cores.add(cor2);
			cores.add(cor3);
			cores.add(cor4);
			
		    System.out.println("\n Lista de todas as cores digitadas: ");
		    System.out.println(cores);
				
			Collections.sort(cores);
			System.out.println("\n Lista de cores depois de ordenadas: ");
			System.out.println(cores);
			
			
			
			
			
			
		
		
		

			
			
		

	}

}
