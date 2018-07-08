
public class CustoDirecao {
	private int custo;
	private Direcao direcao;
	
	public CustoDirecao(int custo, Direcao direcao) {
		this.custo = custo;
		this.direcao = direcao;
	}
	
	public int getCusto() {
		return custo;
	}
	
	public void setCusto(int custo) {
		this.custo = custo;
	}
	
	public Direcao getDirecao() {
		return direcao;
	}
	
	public void setDirecao(Direcao direcao) {
		this.direcao = direcao;
	}
}
