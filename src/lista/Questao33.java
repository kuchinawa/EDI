package lista;

public class Questao33 {
	public static void main(String args[]) {

		String palavra = "exatamente";

		Dicionario[] dic = new Dicionario[palavra.length()];

		for (int i = 0; i < palavra.length(); i++) {
			dic[i] = new Dicionario();
			dic[i].carac = palavra.charAt(i);
			dic[i].vezes++;

		}

		for (int i = 0; i < palavra.length(); i++) {
			for (int j = 0; j < palavra.length(); j++) {
				if ((dic[i].carac == dic[j].carac) && (i != j)) {
					dic[i].vezes++;
				}
			}
		}

		for (int i = 0; i < palavra.length(); i++) {
			if (dic[i].vezes == 1) {
				System.out.println(dic[i].carac + "=" + dic[i].vezes);
			} else if (dic[i].vezes > 1) {
				System.out.println(dic[i].carac + "=" + dic[i].vezes);
				for (int j = 0; j < palavra.length(); j++) {
					if (dic[j].carac == dic[i].carac) {
						dic[j].vezes = dic[i].vezes - dic[i].vezes;
					}
				}
			}

		}

	}
}

class Dicionario {
	char carac;
	int vezes;
}