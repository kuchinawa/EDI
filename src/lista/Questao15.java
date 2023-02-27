package lista;

import java.util.Scanner;

public class Questao15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Insira um numero inteiro: ");
		int numero = input.nextInt();
		switch (numero) {
		case 1:
			System.out.println("um");
			break;
		case 2:
			System.out.println("dois");
			break;
		case 3:
			System.out.println("tres");
			break;
		case 4:
			System.out.println("quatro");
			break;
		case 5:
			System.out.println("cinco");
			break;
		default:
			System.out.println("valor invalido");
			break;
		}
		input.close();
	}
}
