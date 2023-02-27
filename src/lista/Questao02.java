package lista;

import java.util.Scanner;

public class Questao02 {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);

		System.out.print("Informe sua idade: ");
		int idade = t.nextInt();
		t.nextLine(); 

		System.out.print("Informe a primeira letra do seu nome: ");
		char primeiraLetraDoNome = t.next().charAt(0);
		t.nextLine();

		System.out.print("Informe seu nome completo: ");
		String nomeCompleto = t.nextLine();

		System.out.println("Idade: " + idade);
		System.out.println("Primeira letra do nome: " + primeiraLetraDoNome);
		System.out.println("Nome completo: " + nomeCompleto);

		t.close();
	}
}
