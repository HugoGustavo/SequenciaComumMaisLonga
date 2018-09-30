
public class Resultado {
	private String sequencia1;
	private String sequencia2;
	private String subsequencia;
	private long tempo;
	
	public String getSequencia2() {
		return sequencia2;
	}
	
	public void setSequencia2(String sequencia2) {
		this.sequencia2 = sequencia2;
	}
	
	public String getSequencia1() {
		return sequencia1;
	}
	
	public void setSequencia1(String sequencia1) {
		this.sequencia1 = sequencia1;
	}

	public String getSubsequencia() {
		return subsequencia;
	}

	public void setSubsequencia(String subsequencia) {
		this.subsequencia = subsequencia;
	}

	public long getTempo() {
		return tempo;
	}

	public void setTempo(long tempo) {
		this.tempo = tempo;
	}
	
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Sequencia 1 : " + this.sequencia1 + "\n");
		stringBuilder.append("Sequencia 2 : " + this.sequencia2 + "\n");
		stringBuilder.append("Subsequencia: " + this.subsequencia + "\n");
		stringBuilder.append("Tempo       : " + this.tempo + "\n");
		return stringBuilder.toString();
	}

}
