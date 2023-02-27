package lista;

import java.util.Scanner;

public class Questao16B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o numero inicial: ");
		int numInicial = scanner.nextInt();

		System.out.print("Informe o numero final: ");
		int numFinal = scanner.nextInt();

		if (numInicial > numFinal) {
			System.out.println("O numero inicial deve ser menor ou igual ao numero final.");
		}

		System.out.print("Sequencia de numeros: ");
		do {
			System.out.print(numInicial + " ");
			numInicial++;
		} while (numInicial <= numFinal);
		scanner.close();
	}
}
