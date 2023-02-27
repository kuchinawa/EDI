package lista;

import java.util.Scanner;

public class Questao12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Insira sua média parcial: ");
		double media = input.nextDouble();

		if (media >= 7) {
			System.out.println("Você está aprovado!");
		}
		else if (media >= 3) {
			System.out.println("Você está na final!");
		}
		else {
			System.out.println("Você está reprovado!");
		}
		input.close();
	}
}
