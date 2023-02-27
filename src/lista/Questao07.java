package lista;

import java.util.Scanner;

public class Questao07 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira o primeiro numero real: ");
		double num1 = entrada.nextDouble();
		System.out.print("Insira o segundo numero real: ");
		double num2 = entrada.nextDouble();

		if (num2 == 0) {
			System.out.println("Divisão por zero é inválida!");
		}

		double resultado = num1 / num2;
		System.out.println("O resultado da divisão éa " + resultado);

		entrada.close();
	}
}