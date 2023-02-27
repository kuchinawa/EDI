package lista;

import java.util.Scanner;

public class Questao05 {
	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		System.out.print("Insira o primeiro numero real: ");
		double num1 = numero.nextDouble();
		System.out.print("Insira o segundo numero real: ");
		double num2 = numero.nextDouble();
		System.out.print("Insira o terceiro numero real: ");
		double num3 = numero.nextDouble();
		double media = (num1 + num2 + num3) / 3;
		System.out.println("A média aritmética é: " + media);

		numero.close();
	}
}
