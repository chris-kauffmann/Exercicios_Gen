package poo;

public class Produto {
	
	private String tipoConsole;
	private String jogoConsole;
	private String tipoAcessorio;
	private String colecionavel;
	private String tipoRoupa;
	
	
	public Produto(String tipoConsole, String jogoConsole, String tipoAcessorio, String colecionavel,
			String tipoRoupa) {
		super();
		this.tipoConsole = tipoConsole;
		this.jogoConsole = jogoConsole;
		this.tipoAcessorio = tipoAcessorio;
		this.colecionavel = colecionavel;
		this.tipoRoupa = tipoRoupa;
	}


	public String getTipoConsole() {
		return tipoConsole;
	}


	public void setTipoConsole(String tipoConsole) {
		this.tipoConsole = tipoConsole;
	}


	public String getJogoConsole() {
		return jogoConsole;
	}


	public void setJogoConsole(String jogoConsole) {
		this.jogoConsole = jogoConsole;
	}


	public String getTipoAcessorio() {
		return tipoAcessorio;
	}


	public void setTipoAcessorio(String tipoAcessorio) {
		this.tipoAcessorio = tipoAcessorio;
	}


	public String getColecionavel() {
		return colecionavel;
	}


	public void setColecionavel(String colecionavel) {
		this.colecionavel = colecionavel;
	}


	public String getTipoRoupa() {
		return tipoRoupa;
	}


	public void setTipoRoupa(String tipoRoupa) {
		this.tipoRoupa = tipoRoupa;
	}
	
	
	public void imprimirInfo() {
		
	      System.out.println("\n\t Menu de produtos: "+
	                         "\n Tipo do Console: "+tipoConsole+
	                         "\n Jogos para o console: "+jogoConsole+
	                         "\n Acessórios para o console: "+tipoAcessorio+
	                         "\n Colecionáveis: "+colecionavel+
	                         "\n Roupas: "+tipoRoupa);
	}
	

}
