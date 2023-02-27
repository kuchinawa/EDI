package lista;

import java.util.Scanner;

public class Questao08 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira seu peso em kg: ");
		double peso = entrada.nextDouble();
		System.out.print("Insira sua altura em metros: ");
		double altura = entrada.nextDouble();
		
		if (altura == 0) {
			System.out.println("Altura não pode ser zero!");
		}
		
		double imc = peso / (altura * altura);
		System.out.println("Seu IMC é: " + imc);
		entrada.close();
	}
}
