import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Principal {
	public static long media(List<Long> tempos) {
		long tempo = 0;
		for ( Long t : tempos )
			tempo+=t;
		return (long)(tempo / tempos.size());
	}
	
	public static void main(String[] args) {
		for (int i = 0; i <= 6200; i+=100) {
			List<Long> tempos = new ArrayList<>();	
			for (int j = 0; j < 10; j++ ) {
				String X = GeradorString.executar(i);
				String Y = GeradorString.executar(i);
				SubsequenciaComumMaisLonga subsequenciaComumMaisLonga = new SubsequenciaComumMaisLonga(X, Y);
				Resultado resultado = subsequenciaComumMaisLonga.executar();
				tempos.add(resultado.getTempo());
			}
			OptionalDouble media = tempos.stream().mapToLong(x -> x).average();
			System.out.println(i + "," + media.orElse(0));
		}
	}
}
