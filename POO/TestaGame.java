package poo;

public class TestaGame {

	public static void main(String[] args) {
		
		Produto products1 = new Produto ("Playstation 5","Horizon Forbidden West","Controle sem fio DualSense","Funko Ellie TLOU2","Camiseta GOW");
		
		products1.imprimirInfo();
		
		System.out.println("\n Alteração do acessório:");
		
		products1.setTipoAcessorio("Headset sem fio PULSE 3D");
		products1.imprimirInfo();
		
		System.out.println("\n Alteração da camiseta: ");
		
		products1.setTipoRoupa("Camiseta TLOU Look for the light");
		products1.imprimirInfo();
		
		JogoProduto products2 = new JogoProduto ("Playstation 4","The Last of Us Part II","Controle sem fio","Funko Ellie","Camiseta Sony","Mídia Fisica",2020);
		
		products2.imprimirInfoJ();
		
		ConsoleProduto products3 = new ConsoleProduto ("Playstation", "Days Gone"," Controle sem fio","Monopoly Gamer SM","Camiseta Nintendo",
				"Playstation 4","Edição Limitada Prata");
		
		products3.imprimirInfoC();
		
	}

}
