package poo;

public class JogoProduto extends Produto {

	private String tipoMidia;
	private int anoLancamento;
	
	public JogoProduto(String tipoConsole, String jogoConsole, String tipoAcessorio, String colecionavel,
			String tipoRoupa, String tipoMidia, int anoLancamento) {
		super(tipoConsole, jogoConsole, tipoAcessorio, colecionavel, tipoRoupa);
		this.tipoMidia = tipoMidia;
		this.anoLancamento = anoLancamento;
	}
    
	

	public String getTipoMidia() {
		return tipoMidia;
	}

	public void setTipoMidia(String tipoMidia) {
		this.tipoMidia = tipoMidia;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	
	public void imprimirInfoJ() {
		
		System.out.println("\n\t Menu de produtos: "+
	                         "\n Tipo do Console: "+getTipoConsole()+
	                         "\n Jogos para o console: "+getJogoConsole()+
	                         "\n Acessórios para o console: "+getTipoAcessorio()+
	                         "\n Colecionáveis: "+getColecionavel()+
	                         "\n Roupas: "+getTipoRoupa()+
	                         "\n Tipo de mídia do jogo: "+tipoMidia+
	                         "\n Ano de lançamento do jogo: "+anoLancamento);
	}
	
	
}
