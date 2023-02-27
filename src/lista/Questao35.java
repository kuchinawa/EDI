package lista;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Questao35 {

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

		try (BufferedWriter writer = new BufferedWriter(new FileWriter("resultado.csv"))) {
			for (int i = 0; i < palavras.length; i++) {
				if (contagemDePalavras[i] > 0) {
					String linha = palavras[i] + "," + contagemDePalavras[i];
					writer.write(linha);
					writer.newLine();
					contagemDePalavras[i] = 0;
					for (int j = i + 1; j < palavras.length; j++) {
						if (palavras[j].equals(palavras[i])) {
							contagemDePalavras[j] = -1;
						}
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
