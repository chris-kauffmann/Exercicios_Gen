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
	}

}
