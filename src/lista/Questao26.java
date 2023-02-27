package lista;

import java.util.Scanner;

public class Questao26 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o numero de linhas da matriz: ");
		int linhas = entrada.nextInt();
		System.out.print("Digite o numero de colunas da matriz: ");
		int colunas = entrada.nextInt();
		int[][] matriz = new int[linhas][colunas];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("Digite o valor do elemento [" + i + "][" + j + "]: ");
				matriz[i][j] = entrada.nextInt();
			}
		}

		System.out.println("Valores da matriz:");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("|" + matriz[i][j] + "|");
			}
			System.out.println();
		}
		entrada.close();
	}
}
