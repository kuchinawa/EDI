package lista;

public class Questao29 {
	private static int[] array = { 8, 2, 1, 6, 5 }; // inicializa o arrya com os numero
	private static int indice = 2; // define o indice a ser movido

	public static void main(String[] args) {
		System.out.println("Entrada: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print("[" + array[i] + "]");
		}
		while (indice > 0 && (array[indice] < array[indice - 1])) {
			int temp = array[indice];
			array[indice] = array[indice - 1];
			array[indice - 1] = temp;
			indice--;
		}

		System.out.println("\nSaida: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print("[" + array[i] + "]");
		}
	}
}