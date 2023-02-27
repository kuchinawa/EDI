package lista;

import java.util.Scanner;

public class Questao09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Insira o raio do c�rculo: ");
		double raio = input.nextDouble();

		if (raio <= 0) {
			System.out.println("O raio deve ser positivo!");
		}

		double pi = Math.PI;

		double area = pi * (raio * raio);

		System.out.println("A área do circulo é: " + area);

		input.close();
	}
}
