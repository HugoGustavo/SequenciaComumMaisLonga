import java.util.Random;

public class GeradorString {
	public static String executar(int tamanho) {
		StringBuilder stringBuilder = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < tamanho; i++) {
			char letra = (char)( random.nextInt(26) + 65);
			stringBuilder.append(letra);
		}
		return stringBuilder.toString();
	}
}
