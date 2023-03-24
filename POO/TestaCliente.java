package poo;

import poo.Cliente;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente client1 = new Cliente("Luis Roberto","luisgmestredojava@generation.com",25,123456789,987654321);
		
        client1.imprimirInfo();
		
		System.out.println("\n Alteração no email: ");
		
		client1.setEmailCliente("luisaojavanaveia@generation.com");
		client1.imprimirInfo();
		
		System.out.println("\n Alteração no nome do cliente: ");
		
		client1.setNomeCliente("Luis Roberto Guerreiro");
		client1.imprimirInfo();

		
		
	}

}
