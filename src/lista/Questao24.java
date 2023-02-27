package lista;

import java.util.Scanner;

public class Questao24 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("Digite a opcao desejada:");
			System.out.println("1 - Potenciacao");
			System.out.println("2 - Raiz Quadrada");
			System.out.println("3 - Fatorial");
			System.out.println("0 - Sair");
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("Digite a base: ");
				double base = entrada.nextDouble();
				System.out.print("Digite o expoente: ");
				double expoente = entrada.nextDouble();
				System.out.println("Resultado: " + Math.pow(base, expoente));
				break;
			case 2:
				System.out.print("Digite o numero: ");
				double numero = entrada.nextDouble();
				System.out.println("Resultado: " + Math.sqrt(numero));
				break;
			case 3:
				System.out.print("Digite um numero para calcular o fatorial: ");
				int numeroFatorial = entrada.nextInt();
				int fatorial = calcularFatorial(numeroFatorial);
				System.out.println("O fatorial de " + numeroFatorial + " e: " + fatorial);
				break;
			case 0:
				System.out.println("Encerrando a calculadora...");
				break;
			default:
				System.out.println("Opcao invalida. Digite novamente.");
				break;
			}

		} while (opcao != 0);
	}

	public static int calcularFatorial(int numero) {
		int fatorial = 1;
		for (int i = 2; i <= numero; i++) {
			fatorial *= i;
		}
		return fatorial;
	}
}
