package lista;

public class Questao33B {
    public static void main(String args[]) {
        String palavra = "paralelepipedodecrack";
        int[] quantidadeDeLetras = new int[26];
        for (int i = 0; i < palavra.length(); i++) {
            quantidadeDeLetras[palavra.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (quantidadeDeLetras[i] > 0) {
                System.out.println((char)(i + 'a') + " = " + quantidadeDeLetras[i]);
            }
        }
    }
}