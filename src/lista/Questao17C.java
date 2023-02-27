package lista;

import java.util.Scanner;

public class Questao17C {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o numero inicial: ");
		int inicial = scanner.nextInt();
		System.out.print("Informe o numero final: ");
		int numFinal = scanner.nextInt();

		for (int i = inicial; i <= numFinal; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}

		scanner.close();
	}
}
