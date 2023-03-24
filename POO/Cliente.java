package poo;

public class Cliente {
	
	private String nomeCliente;
	private String emailCliente;
	private int idadeCliente;
	private int cpfCliente;
	private int rgCliente;
	


	public Cliente(String nomeCliente, String emailCliente, int idadeCliente, int cpfCliente, int rgCliente ) {
		super();
		this.nomeCliente = nomeCliente;
		this.emailCliente = emailCliente;
		this.idadeCliente = idadeCliente;
		this.cpfCliente = cpfCliente;
		this.rgCliente = rgCliente;
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
	
	public int getIdadeCliente() {
		return idadeCliente;
	}

	public void setIdadeCliente(int idadeCliente) {
		this.idadeCliente = idadeCliente;
	}

	public int getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(int cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	public int getRgCliente() {
		return rgCliente;
	}

	public void setRgCliente(int rgCliente) {
		this.rgCliente = rgCliente;
	}
	
	public void imprimirInfo() {
		
		
		System.out.println("\n Dados do cliente:"+
				           "\n Nome: "+nomeCliente+
				           "\n Email: "+emailCliente+
				           "\n Idade:"+idadeCliente+" anos"+
				           "\n CPF: "+cpfCliente+
				           "\n RG:"+rgCliente);
	}

}


