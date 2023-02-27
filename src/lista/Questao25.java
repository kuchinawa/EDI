package lista;

import java.util.Scanner;

public class Questao25 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o tamanho do vetor: ");
		int tamanho = entrada.nextInt();
		int[] vetor = new int[tamanho];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite o valor do elemento " + (i + 1) + ": ");
			vetor[i] = entrada.nextInt();
		}

		System.out.println("Valores do vetor:");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + "|");
		}
		entrada.close();
	}
}
