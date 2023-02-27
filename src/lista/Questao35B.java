package lista;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Questao35B {
	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new FileReader("resultado.csv"))) {
			String linha;
			while ((linha = reader.readLine()) != null) {
				String[] partes = linha.split(",");
				String palavra = partes[0];
				int contagem = Integer.parseInt(partes[1]);
				System.out.println(palavra + " = " + contagem);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}