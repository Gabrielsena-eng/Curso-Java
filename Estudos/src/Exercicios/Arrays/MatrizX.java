package Exercicios.Arrays;

import java.util.List;
import java.util.Scanner;

public class MatrizX {
    public static void main(String[] args) {
// Em processo....
        Scanner sc = new Scanner(System.in);

        int n, m;

        System.out.print("Digite o número de linhas: ");
        m = sc.nextInt();
        System.out.print("Digite o número de colunas: ");
        n = sc.nextInt();

        int [][] matriz = new int[m][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int linha = sc.nextInt();
        int coluna = sc.nextInt();

        System.out.println();

        sc.close();
    }
    public static Integer proximidadeDoValor(int m, int n, int [][] matriz){

        int left = matriz[m][n - 1];
        int right = matriz[m][n + 1];
        int down = matriz[m + 1][n];
        int up = matriz[m - 1][n];

        int[] vizinhos = new int[4];

        return 4;

        }
}