package atividadePratica;

import java.util.Scanner;

public class DoacaoSangueIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		String nome;
		int idade;
		boolean doacao;
	    
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Digite seu nome: ");
		nome = leia.nextLine();
		System.out.println("\n Digite sua idade: ");
		idade = leia.nextInt();
		System.out.println("\n Você já doou sangue alguma vez?\n(Digite true para sim, e false para não) ");
		doacao = leia.nextBoolean();
		
		
		if (idade>=18 && idade<=59) {
			
			System.out.println(nome+" você está apto(a) para doar sangue!");
			
		}else if (idade>=60 && idade<=69 && doacao==true) {
			
			System.out.println(nome+" você está apto(a) para doar sangue!");
			
		}else if (idade>60 && idade<=69 && doacao==false) {
			
			System.out.println(nome+" você não está apto(a) para doar sangue!");
		
		}else {
			
			System.out.println(nome+" você não está apto(a) para doar sangue!");
		}
	

	}

}
