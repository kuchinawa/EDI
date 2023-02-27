package lista;

import java.util.Scanner;

public class Questao20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do investimento inicial: ");
        double investimentoInicial = scanner.nextDouble();

        System.out.print("Digite o valor do investimento mensal: ");
        double investimentoMensal = scanner.nextDouble();

        System.out.print("Digite a quantidade de meses do investimento: ");
        int meses = scanner.nextInt();

        System.out.print("Digite a taxa de juros mensal (em %): ");
        double taxaJurosMensal = scanner.nextDouble();

        double saldoAcumulado = investimentoInicial;
        double jurosMensais;
        double rendimentoMensal;


  /*      DecimalFormat df = new DecimalFormat("#.##");
        DecimalFormat dn = new DecimalFormat("00"); */
        
        for (int i = 1; i <= meses; i++) {
            jurosMensais = saldoAcumulado * (taxaJurosMensal / 100);
            saldoAcumulado += investimentoMensal + jurosMensais;
            rendimentoMensal = jurosMensais + investimentoMensal;
            System.out.printf("Mes " + i + ": rendimento mensal = " +  rendimentoMensal + ",\t \t saldo acumulado = " + saldoAcumulado);
            System.out.printf("\n");
        }
        scanner.close();
    }
}


