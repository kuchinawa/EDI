package lista;

import java.util.Scanner;

public class Questao03 {
	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);

		System.out.print("Informe o primeiro numero inteiro: ");
		int num1 = numero.nextInt();
		numero.nextLine();

		System.out.print("Informe o segundo numero inteiro: ");
		int num2 = numero.nextInt();
		numero.nextLine();

		System.out.println("Adição: " + (num1 + num2));
		System.out.println("Subtração: " + (num1 - num2));
		System.out.println("Multiplicação: " + (num1 * num2));
		System.out.println("Quociente da divisão: " + (num1 / num2));
		System.out.println("Resto da divisão: " + (num1 % num2));

		numero.close();
	}
}
