package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class CollectionInteiros {

	public static void main(String[] args) {
		
		List<Integer> numeros = new ArrayList <Integer>();
		 
		Scanner leia = new Scanner(System.in);
		
		Set<Integer> setNum = new HashSet<Integer>();
		
		for(int i=0;i<10;i++) {
		
		System.out.println("\n Digite um número (não repita os números): ");
		int numbers = leia.nextInt();
		setNum.add(numbers);
		
		 
		} Iterator<Integer> meuSet = setNum.iterator();
	
		
		System.out.println("\n Lista de números: ");
		System.out.println(setNum);
		
		

	}

}
