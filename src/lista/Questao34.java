package lista;

public class Questao34 {
	public static void main(String[] args) {
		String frase = "ele ele ele tu tu eu";
		String[] palavras = frase.split(" ");
		int[] contagemDePalavras = new int[palavras.length];
		for (int i = 0; i < palavras.length; i++) {
			String palavra = palavras[i];
			int contagem = 0;
			for (int j = 0; j < palavras.length; j++) {
				if (palavras[j].equals(palavra)) {
					contagem++;
				}
			}
			contagemDePalavras[i] = contagem;
		}
		String saida = "";
		for (int i = 0; i < palavras.length; i++) {
			if (contagemDePalavras[i] > 0) {
				saida += palavras[i] + " = " + contagemDePalavras[i] + "\n";
				contagemDePalavras[i] = 0;
				for (int j = i + 1; j < palavras.length; j++) {
					if (palavras[j].equals(palavras[i])) {
						contagemDePalavras[j] = -1;
					}
				}
			}
		}
		System.out.println(saida);
	}
}