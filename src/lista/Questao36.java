package lista;

public class Questao36 {
	public static void main(String[] args) {
		Questao36 r = new Questao36();
		int resp = r.fatorial(5);
		System.out.println(resp);
	}

	public int fatorial(int x) {
		if (x == 0)
			return 1;
		return x * fatorial(x - 1);
	}
}