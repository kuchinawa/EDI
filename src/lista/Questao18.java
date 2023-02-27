package lista;

import java.util.Scanner;

@SuppressWarnings("resource")
public class Questao18 {

	static String senhaCorreta = "12345";

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Escolha a opcao de verificacao de senha:");
		System.out.println("1 - While");
		System.out.println("2 - Do-while");
		int opcao = entrada.nextInt();

		switch (opcao) {
		case 1:
			senhaWhile();
			break;
		case 2:
			senhaDoWhile();
			break;
		default:
			System.out.println("Opcao invalida.");
			break;
		}
	}

	public static void senhaWhile() {
		Scanner entrada = new Scanner(System.in);
		String senhaInformada;
		boolean senhaCorretaInformada = false;

		while (!senhaCorretaInformada) {
			System.out.println("(While) Informe a senha:");
			senhaInformada = entrada.nextLine();
			if (senhaInformada.equals(senhaCorreta)) {
				System.out.println("Senha correta.");
				senhaCorretaInformada = true;
			} else {
				System.out.println("Senha incorreta.");
			}
		}
	}

	public static void senhaDoWhile() {
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("(Do-While) Informe a senha: ");
			String senhaInformada = sc.nextLine();

			if (senhaInformada.equals(senhaCorreta)) {
				System.out.println("Senha correta");
				break;
			} else {
				System.out.println("Senha incorreta, tente novamente");
			}
		} while (true);
	}
}
