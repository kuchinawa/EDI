package lista;

import java.util.Scanner;

public class Questao23 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um numero para calcular o fatorial: ");
		int numero = entrada.nextInt();

		int fatorial = 1;
		for (int i = 2; i <= numero; i++) {
			fatorial *= i;
		}

		System.out.println("O fatorial de " + numero + " e: " + fatorial);
	}
}
