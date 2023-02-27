package lista;

import java.util.Scanner;

public class Questao17A {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o numero inicial: ");
		int inicio = scanner.nextInt();

		System.out.println("Informe o numero final: ");
		int fim = scanner.nextInt();

		int num = inicio;
		while (num <= fim) {
			if (num % 2 != 0) {
				System.out.print(num + " ");
			}
			num++;
		}
		scanner.close();
	}
}
