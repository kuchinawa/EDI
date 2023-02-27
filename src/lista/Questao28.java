package lista;

public class Questao28 {
	public static void main(String[] args) {
		int[] vetor = { 3, 7, 2, 9, 5 };

		int maior = vetor[0];
		int menor = vetor[0];

		for (int i = 1; i < vetor.length; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
			}

			if (vetor[i] < menor) {
				menor = vetor[i];
			}
		}

		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
	}
}
