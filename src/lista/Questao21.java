package lista;

import java.util.Scanner;
public class Questao21 {

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    
	    System.out.println("Digite um numero: ");
	    int num = in.nextInt();
	    int cont = 0;
	    for(int i = 1; i < num; i++) {
	      if((num%i)==0) {
	        cont++;
	      }
	      if(cont > 2) {
	        System.out.println("Não é primo.");
	        System.exit(0);
	      }
	    }
	    System.out.println("É primo.");
	    in.close();
	}
}
