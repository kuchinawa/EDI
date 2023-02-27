package lista;

public class Questao27 {
	public static void main(String[] args) {
		int[] vetorOriginal = { 1, 2, 3, 4, 5 };
		int[] vetorInverso = inverterVetor(vetorOriginal);

		System.out.println("Vetor original:");
		for (int i = 0; i < vetorOriginal.length; i++) {
			System.out.print(vetorOriginal[i] + " ");
		}
		System.out.println();

		System.out.println("Vetor inverso:");
		for (int i = 0; i < vetorInverso.length; i++) {
			System.out.print(vetorInverso[i] + " ");
		}
		System.out.println();
	}

	public static int[] inverterVetor(int[] vetorOriginal) {
		int[] vetorInverso = new int[vetorOriginal.length];

		for (int i = 0; i < vetorOriginal.length; i++) {
			vetorInverso[i] = vetorOriginal[vetorOriginal.length - 1 - i];
		}

		return vetorInverso;
	}
}
