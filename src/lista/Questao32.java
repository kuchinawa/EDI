package lista;

import java.io.*;

@SuppressWarnings("serial")
public class Questao32 implements Serializable {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Questao32[] pessoas = null;
		int n = 0;

		try {
			{
				System.out.print("Digite a quantidade de pessoas: ");
				n = Integer.parseInt(reader.readLine());
			}

			ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("pessoas.bin"));
			output.close();

			ObjectInputStream input = new ObjectInputStream(new FileInputStream("pessoas.bin"));

			input.close();

			for (int i = 0; i < n; i++) {
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("Valor inválido. Digite um número inteiro válido.");
		}
	}
}
