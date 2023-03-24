package poo;

import poo.Cliente;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente client1 = new Cliente ("Luis Guerreiro","luisg.mestredojava@generation.com",1234567891);
		
		
		client1.imprimirInfo();
		
		System.out.println("\n Alteração no email: ");
		
		client1.setEmailCliente("luisaojavanaveia@generation.com");
		client1.imprimirInfo();
		
		System.out.println("\n Alteração no nome do cliente: ");
		
		client1.setNomeCliente("Luis Roberto Guerreiro");
		client1.imprimirInfo();

	}

}
