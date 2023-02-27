package lista;

import java.util.Scanner;

public class Questao30 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite uma frase: ");
		String fraseOriginal = entrada.nextLine();

		String[] palavras = fraseOriginal.split(" ");
		String fraseInvertida = "";

		for (int i = palavras.length - 1; i >= 0; i--) {
			String palavra = palavras[i];
			String palavraInvertida = "";
			for (int j = palavra.length() - 1; j >= 0; j--) {
				palavraInvertida += palavra.charAt(j);
			}
			fraseInvertida += palavraInvertida + " ";
		}

		System.out.println("Frase original: " + fraseOriginal);
		System.out.println("Frase invertida: " + fraseInvertida.trim());
		entrada.close();
	}
}
