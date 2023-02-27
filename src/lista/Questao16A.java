package lista;

import java.util.Scanner;

public class Questao16A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o n�mero inicial: ");
		int numInicial = scanner.nextInt();

		System.out.print("Informe o n�mero final: ");
		int numFinal = scanner.nextInt();

		if (numInicial > numFinal) {
			System.out.println("O n�mero inicial deve ser menor ou igual ao n�mero final.");
		}

		System.out.print("Sequ�ncia de n�meros: ");
		while (numInicial <= numFinal) {
			System.out.print(numInicial + " ");
			numInicial++;
		}
		scanner.close();
	}
}
