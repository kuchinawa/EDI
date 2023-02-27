package lista;

import java.util.Scanner;

public class Questao22 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o número inicial do intervalo: ");
		int inicio = entrada.nextInt();
		System.out.print("Digite o número final do intervalo: ");
		int fim = entrada.nextInt();

		int soma = 0;
		for (int i = inicio; i <= fim; i++) {
			soma += i;
		}

		System.out.println("O somatório dos números inteiros do intervalo de " + inicio + " a " + fim + " é: " + soma);
		entrada.close();
	}
}
