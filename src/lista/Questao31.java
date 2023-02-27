package lista;

import java.util.Scanner;

public class Questao31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de pessoas: ");
		int n = sc.nextInt();

		Questao31Pessoa[] pessoas = new Questao31Pessoa[n];

		for (int i = 0; i < n; i++) {
			System.out.println("\nDados da pessoa #" + (i + 1) + ":");

			System.out.print("CPF: ");
			int cpf = sc.nextInt();
			sc.nextLine();

			System.out.print("Nome: ");
			String nome = sc.nextLine();

			System.out.print("Idade: ");
			int idade = sc.nextInt();

			sc.nextLine();

			System.out.print("Sexo (M/F): ");
			char sexo = sc.nextLine().charAt(0);

			System.out.print("Peso (kg): ");
			double peso = sc.nextDouble();

			System.out.print("Altura (m): ");
			double altura = sc.nextDouble();

			pessoas[i] = new Questao31Pessoa(cpf, nome, idade, sexo, peso, altura);
		}

		System.out.println("\nDados das pessoas:");

		for (Questao31Pessoa p : pessoas) {
			System.out.println(p);
		}

		sc.close();
	}
}