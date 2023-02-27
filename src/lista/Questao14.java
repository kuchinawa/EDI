package lista;

import java.util.Scanner;


public class Questao14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Insira o valor de a: ");
		double a = input.nextDouble();
		System.out.print("Insira o valor de b: ");
		double b = input.nextDouble();
		System.out.print("Insira o valor de c: ");
		double c = input.nextDouble();

		double delta = calculaDelta(a, b, c);
		System.out.printf("Delta: %.2f\n", delta);

		if (delta >= 0) {
			calculaRaizes(a, b, delta);
		} else {
			System.out.println("As raizes são imaginárias.");
		}
		input.close();
	}

	public static double calculaDelta(double a, double b, double c) {
		return b * b - 4 * a * c;
	}

	public static void calculaRaizes(double a, double b, double delta) {

		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);

		System.out.printf("x1 = %.2f\n", x1);
		System.out.printf("x2 = %.2f\n", x2);
	}
}
