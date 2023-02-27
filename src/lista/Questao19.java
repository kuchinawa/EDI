package lista;

import java.util.Scanner;

public class Questao19 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um numero de 1 a 9 para ver a tabuada: ");
		int n = entrada.nextInt();

		if (n < 1 || n > 9) {
			System.out.println("Numero invalido. Digite um numero de 1 a 9");
		}

		for (int i = 1; i <= 10; i++) {
			int resultado = n * i;
			System.out.println(n + " x " + i + " = " + resultado);
		}
		entrada.close();
	}
}
