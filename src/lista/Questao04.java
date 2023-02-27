package lista;

import java.util.Scanner;

public class Questao04 {
	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);
		System.out.print("Insira o primeiro numero inteiro: ");
		int num1 = numero.nextInt();
		System.out.print("Insira o segundo numero inteiro: ");
		int num2 = numero.nextInt();
		System.out.print("Insira o terceiro numero inteiro: ");
		int num3 = numero.nextInt();
		double media = (num1 + num2 + num3) / 3.0;
		System.out.println("A média aritmética é: " + media);

		numero.close();
	}
}
