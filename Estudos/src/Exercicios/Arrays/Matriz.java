package Exercicios.Arrays;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Integer[][] matriz = new Integer[n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz [i][j] = sc.nextInt();

            }
        }

        //Demonstrando a matriz
        int count = 0;
        System.out.println();
        System.out.println("Matriz de ordem " + n);
        for (Integer[] integers : matriz) {
            for (int j = 0; j < matriz.length; j++) {
                if (integers[j] < 0) {
                    System.out.print(integers[j] + "");
                    count++;
                } else {
                    System.out.print(+integers[j] + " ");
                }
            }
            System.out.println();
        }
        sc.close();

        System.out.println();
        System.out.println("Diagonal principal:");
        for (int i = 0; i < matriz.length; i++) {
                System.out.print(matriz[i][i] + " ");
            }


        //Números negativos
        System.out.println();
        System.out.println("Numeros negativos: " + count);

    }
}
