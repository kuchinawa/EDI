package lista;

import java.util.Scanner;

public class Questao10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Insira um número inteiro: ");
		int num = input.nextInt();

		if (num % 2 == 0) {
			System.out.println("O número é par.");
		} else {
			System.out.println("O número é impar.");
		}
		input.close();
	}
}
