package lista;

import java.util.Scanner;

public class Questao16C {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o numero inicial: ");
		int numInicial = scanner.nextInt();

		System.out.print("Informe o numero final: ");
		int numFinal = scanner.nextInt();

		for (int i = numInicial; i <= numFinal; i++) {
			System.out.print(i + " ");
		}
		scanner.close();
	}
}
