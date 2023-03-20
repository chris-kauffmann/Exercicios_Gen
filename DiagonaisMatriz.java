package atividadePratica;

import java.util.Scanner;

public class DiagonaisMatriz {
	
	/* Matriz 3X3
	 *     1 2 3
	 *     4 5 6
	 *     7 8 9
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matriz = new int [3][3];
		int linha, coluna, somaDiagonalP=0,somaDiagonalS=0,diagonalP,diagonalS;
		Scanner leia = new Scanner(System.in);
		
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				System.out.println("\n Entre com um número: ");
				matriz [linha][coluna]= leia.nextInt();
				
				
				
			}
		}
		
		
		System.out.println("\n Elementos da diagonal principal: ");
		for(linha=0;linha<3;linha++) {
			diagonalP=matriz[linha][linha];
			System.out.println(diagonalP);
			
			
		}for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				if(linha==coluna) {
					somaDiagonalP+= matriz[linha][coluna];
				}
			}
		}System.out.println("\n Soma dos elementos da Diagonal Principal: "+somaDiagonalP);
		
		
		System.out.println("\n Elementos da diagonal secundária: ");
		for(linha=0;linha<3;linha++) {
			diagonalS=matriz[linha][3-1-linha];
			System.out.println(diagonalS);
			
		
	}for(linha=0;linha<3;linha++) {
		for(coluna=0;coluna<3;coluna++) {
			
			if(linha==coluna) {
				somaDiagonalS+= matriz[linha][coluna];
			}
			
		}
		
		
	}System.out.println("\n Soma dos elementos da Diagonal Secundária: "+somaDiagonalS);
 

}
}
