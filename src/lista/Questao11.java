package lista;

import java.util.Scanner;

public class Questao11 {
	public static void main(String[] args) {
		double conta1 = 100;
		double conta2 = 100;

		Scanner input = new Scanner(System.in);

		System.out.print("Insira o valor da transfer�ncia: ");
		double valor = input.nextDouble();

		if (conta1 < valor) {
			System.out.println("Saldo insuficiente na conta1!");
		}

		conta1 -= valor;
		conta2 += valor;

		System.out.println("Saldo na conta1: R$ " + conta1);
		System.out.println("Saldo na conta2: R$ " + conta2);
		input.close();
	}
}
