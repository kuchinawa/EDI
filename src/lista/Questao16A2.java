package lista;

import javax.swing.JOptionPane;

public class Questao16A2 {
	public static int[] getSequenciaNumeros() {
		String numInicialStr = JOptionPane.showInputDialog("Informe o número inicial:");
		int numInicial = Integer.parseInt(numInicialStr);

		String numFinalStr = JOptionPane.showInputDialog("Informe o número final:");
		int numFinal = Integer.parseInt(numFinalStr);

		if (numInicial <= numFinal) {
			int numAtual = numInicial;
			int tamanho = (numFinal - numInicial) + 1;
			int[] arraySequencia = new int[tamanho];
			int i = 0;
			while (numAtual <= numFinal) {
				arraySequencia[i] = numAtual;
				numAtual++;
				i++;
			}
			return arraySequencia;
		} else {
			JOptionPane.showMessageDialog(null, "Número inicial deve ser menor ou igual ao número final.");
			return null;
		}
	}

	public static void main(String[] args) {
		int[] sequencia = getSequenciaNumeros();
		if (sequencia != null) {
			String output = "Sequencia de números: ";
			for (int i = 0; i < sequencia.length; i++) {
				output += sequencia[i] + " ";
			}
			JOptionPane.showMessageDialog(null, output);
		}
	}
}
