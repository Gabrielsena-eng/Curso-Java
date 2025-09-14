package Exercicios;

import java.util.Scanner;

public class LeituraDeIntervalo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double valor;
        valor = sc.nextDouble();

        if (valor >= 0 && valor <= 25){
            System.out.println("o valor esta no intervalo de [0, 25]");
        }
        else if (valor > 25 && valor <=50) {
            System.out.println("o valor esta no intervalo de [25, 50");
        }
        else if (valor > 25 && valor <=75) {
            System.out.println("o valor esta no intervalo de [50, 75]");
        }
        else if (valor > 75 && valor <=100) {
            System.out.println("o valor esta no intervalo de [75, 100]");
        }
        else {
            System.out.println("O valor não esta dentre os intervalos");
        }
        sc.close();

    }
}
