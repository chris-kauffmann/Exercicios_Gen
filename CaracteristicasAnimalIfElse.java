package atividadePratica;

import java.util.Scanner;

public class CaracteristicasAnimalIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		String palavra1,palavra2,palavra3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Digite a primeira palavra: ");
		palavra1 = leia.nextLine();
		System.out.println("\n Digite a segunda palavra: ");
		palavra2 = leia.nextLine();
		System.out.println("\n Digite a terceira palavra: ");
		palavra3 = leia.nextLine();
		
		if(palavra1.equalsIgnoreCase("vertebrado") && palavra2.equalsIgnoreCase("mamífero") && palavra3.equalsIgnoreCase("onívoro")) {
			
			System.out.println("\n Homem");
		}else if(palavra1.equalsIgnoreCase("vertebrado") && palavra2.equalsIgnoreCase("ave") && palavra3.equalsIgnoreCase("onívoro")) {
			
			System.out.println("\n Pomba");
			
		}else if(palavra1.equalsIgnoreCase("vertebrado") && palavra2.equalsIgnoreCase("mamífero") && palavra3.equalsIgnoreCase("herbívoro")) {
			
			System.out.println("\n Vaca");
		}else if  (palavra1.equalsIgnoreCase("vertebrado") && palavra2.equalsIgnoreCase("ave") && palavra3.equalsIgnoreCase("carnívoro")){
			
			System.out.println("\n Águia");
		}
		
		if(palavra1.equalsIgnoreCase("invertebrado") && palavra2.equalsIgnoreCase("inseto") && palavra3.equalsIgnoreCase("hematófago")) {
			
			System.out.println("\n Pulga");
		}else if (palavra1.equalsIgnoreCase("invertebrado") && palavra2.equalsIgnoreCase("inseto") && palavra3.equalsIgnoreCase("herbívoro")) {
			
			System.out.println("\n Lagarta");
		}else if (palavra1.equalsIgnoreCase("invertebrado") && palavra2.equalsIgnoreCase("anelídeo") && palavra3.equalsIgnoreCase("hematófago")) {
			
			System.out.println("\n Sanguessuga");
		}else if(palavra1.equalsIgnoreCase("invertebrado") && palavra2.equalsIgnoreCase("anelídeo") && palavra3.equalsIgnoreCase("onívoro"))  {
			System.out.println("\n Minhoca");
		}

	}

}
