package lista;

import java.util.Scanner;
public class Questao06 {

	  public static void main(String[] args) {
	    Scanner qtd = new Scanner(System.in);

	    System.out.print("Insira a quantidade de refrigerantes: ");
	    int refrigerantes = qtd.nextInt();
	    System.out.print("Insira a quantidade de fatias de pizza: ");
	    int fatias = qtd.nextInt();
	    System.out.print("Insira a quantidade de pessoas na mesa: ");
	    int pessoas = qtd.nextInt();

	    double precoRefrigerante = 1.5;
	    double precoFatia = 3;
	    double taxaGarcom = 0.1;

	    double totalSemTaxa = (refrigerantes * precoRefrigerante) + (fatias * precoFatia);
	    double totalComTaxa = totalSemTaxa + (totalSemTaxa * taxaGarcom);
	    double rateioPessoa = totalComTaxa / pessoas;

	    System.out.println("Total sem taxa: R$ " + totalSemTaxa);
	    System.out.println("Total com taxa: R$ " + totalComTaxa);
	    System.out.println("Rateio por pessoa com taxa: R$ " + rateioPessoa);
	    
	    qtd.close();
	}
}