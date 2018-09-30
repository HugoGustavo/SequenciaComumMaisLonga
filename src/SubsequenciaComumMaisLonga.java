
public class SubsequenciaComumMaisLonga {
	private String sequencia1, sequencia2;
	private CustoDirecao custoDirecao[][];
	private String subsequencia;
	
	public SubsequenciaComumMaisLonga(String sequencia1, String sequencia2) {
		this.sequencia1 = sequencia1;
		this.sequencia2 = sequencia2;
	}
	
	private void inicializaMatrizCusto() {
		this.custoDirecao = new CustoDirecao[sequencia1.length()+1][sequencia2.length()+1];
		for (int i = 0; i < sequencia1.length()+1; i++)
			this.custoDirecao[i][0] = new CustoDirecao(0, Direcao.NENHUMA);
		for (int j = 0; j < sequencia2.length()+1; j++)
			this.custoDirecao[0][j] = new CustoDirecao(0, Direcao.NENHUMA);		
	}
	
	private void calcularMatrizCusto() {
		inicializaMatrizCusto();
		int m = this.sequencia1.length();
		int n = this.sequencia2.length();
		char char1;
		char char2;
		for (int i = 1; i < m+1; i++ ) {
			for ( int j = 1; j < n+1; j++) {
				char1 = sequencia1.charAt(i-1);
				char2 = sequencia2.charAt(j-1);
				if ( char1 == char2 ) {
					this.custoDirecao[i][j] = new CustoDirecao(this.custoDirecao[i-1][j-1].getCusto() + 1, Direcao.DIAGONAL);					
				} else if ( custoDirecao[i-1][j].getCusto() >= custoDirecao[i][j-1].getCusto() ){
					this.custoDirecao[i][j] = new CustoDirecao( this.custoDirecao[i-1][j].getCusto(), Direcao.CIMA);
				} else {
					this.custoDirecao[i][j] = new CustoDirecao(this.custoDirecao[i][j-1].getCusto(), Direcao.ESQUERDA);					
				}
			}
		}
	}
	
	private String montarString(int i, int j) {
		if ( i == 0 ||  j == 0 ) {
			return "";
		}
		
		if ( this.custoDirecao[i][j].getDirecao() == Direcao.DIAGONAL ) {
			return montarString(i-1, j-1) + sequencia1.charAt(i-1) + "";
		} else if ( this.custoDirecao[i][j].getDirecao() == Direcao.CIMA ){
			return montarString(i-1, j);
		} else {
			return montarString(i, j-1);
		}
			
		
	}
	
	public Resultado executar() {
		long tempoInicio = System.currentTimeMillis();
		calcularMatrizCusto();
		long tempoFim = System.currentTimeMillis();
		long tempoTotal = tempoFim - tempoInicio;
		String subsequencia = montarString(sequencia1.length(), sequencia2.length());
		Resultado resultado = new Resultado();
		resultado.setSequencia1(sequencia1);
		resultado.setSequencia2(sequencia2);
		resultado.setSubsequencia(subsequencia);
		resultado.setTempo(tempoTotal);
		return resultado;
	}
	
	public String getSubsequencia() {
		return this.subsequencia;
	}
	
	
}
