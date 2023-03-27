package poo;

public class ConsoleProduto extends Produto{
	
	private String modeloConsole;
	private String corConsole;
	
	public ConsoleProduto(String tipoConsole, String jogoConsole, String tipoAcessorio, String colecionavel,
			String tipoRoupa, String modeloConsole, String corConsole) {
		super(tipoConsole, jogoConsole, tipoAcessorio, colecionavel, tipoRoupa);
		this.modeloConsole = modeloConsole;
		this.corConsole = corConsole;
	}

	public String getModeloConsole() {
		return modeloConsole;
	}

	public void setModeloConsole(String modeloConsole) {
		this.modeloConsole = modeloConsole;
	}

	public String getCorConsole() {
		return corConsole;
	}

	public void setCorConsole(String corConsole) {
		this.corConsole = corConsole;
	}
	
    public void imprimirInfoC() {
    	
    	System.out.println("\n\t Menu de produtos: "+
                "\n Tipo do Console: "+getTipoConsole()+
                "\n Jogos para o console: "+getJogoConsole()+
                "\n Acessórios para o console: "+getTipoAcessorio()+
                "\n Colecionáveis: "+getColecionavel()+
                "\n Roupas: "+getTipoRoupa()+
                "\n Modelo do Console: "+modeloConsole+
                "\n Cor do console: "+corConsole);
    }
}
