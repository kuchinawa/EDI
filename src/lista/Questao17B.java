package lista;

import java.util.Scanner;

public class Questao17B {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o numero inicial:");
		int numInicial = scanner.nextInt();

		System.out.println("Informe o numero final:");
		int numFinal = scanner.nextInt();

		int numAtual = numInicial;

		do {
			if (numAtual % 2 != 0) {
				System.out.print(numAtual + " ");
			}
			numAtual++;
		} while (numAtual <= numFinal);

		scanner.close();
	}
}