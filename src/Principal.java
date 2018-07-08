
public class Principal {
	public static void main(String[] args) {
		String X = "XMJYAUZ";
		String Y = "MZJAWXU";
		SubsequenciaComumMaisLonga subsequenciaComumMaisLonga = new SubsequenciaComumMaisLonga(X, Y);
		subsequenciaComumMaisLonga.executar();
		System.out.println(subsequenciaComumMaisLonga.getSubsequencia());
	}
}
