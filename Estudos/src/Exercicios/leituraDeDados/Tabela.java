package Exercicios.leituraDeDados;

import java.util.Scanner;

public class Tabela {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double codigo = sc.nextDouble();
        sc.nextLine();
        double quantidade = sc.nextDouble();

        double Valor = 0;
        if (codigo == 1) {
            Valor = 4.0 * quantidade;
        } else if (codigo == 2) {
            Valor = 4.50 * quantidade;
        } else if (codigo == 3) {
            Valor = 5.0 * quantidade;
        } else if (codigo == 4) {
            Valor = 2.0 * quantidade;
        } else if (codigo == 6) {
            Valor = 1.5 * quantidade;
        }

        System.out.printf("Vai custar: R$%.2f.%n", Valor);

        sc.close();

    }
}
