package lista;

import java.util.Scanner;

public class Questao13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Insira a nota da primeira avaliação: ");
		double av1 = input.nextDouble();
		System.out.print("Insira a nota da segunda avaliação: ");
		double av2 = input.nextDouble();
		System.out.print("Insira a nota da terceira avaliação: ");
		double av3 = input.nextDouble();

		double media = (av1 + av2 +av3)/3;

		System.out.printf("M�dia parcial: %.2f\n", media);

		if (media >= 7) {
			System.out.println("Situaçãoo parcial: Aprovado");
		} else if (media >= 3.5) {
			System.out.println("Situação parcial: Recuperação");
			double notaFinalNecessaria = (5 - (media * 0.7)) / 0.3;
			System.out.printf("Nota necessaria para ser aprovado: %.2f\n", notaFinalNecessaria);
		} else {
			System.out.println("Situação parcial: Reprovado");
		}
		input.close();
	}
}
