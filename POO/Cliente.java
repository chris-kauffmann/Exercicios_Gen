package poo;

public class Cliente {
	
	private String nomeCliente;
	private String emailCliente;
	private int cpfCliente;
	
	public Cliente(String nomeCliente, String emailCliente, int cpfCliente) {
		super();
		this.nomeCliente = nomeCliente;
		this.emailCliente = emailCliente;
		this.cpfCliente = cpfCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	public int getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(int cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	
	public void imprimirInfo() {
		
		
		System.out.println("\n Dados do cliente:"+
				           "\n Nome: "+nomeCliente+
				           "\n Email: "+emailCliente+
				           "\n CPF: "+cpfCliente);
	}

}


