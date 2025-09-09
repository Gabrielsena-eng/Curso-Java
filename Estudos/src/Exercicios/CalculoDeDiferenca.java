package Exercicios;

import java.util.Scanner;

public class CalculoDeDiferenca {
    public static void main(String[] args) {
        int A, B, C, D;
        Scanner sc = new Scanner(System.in);

        A = sc.nextInt();
        sc.nextLine();
        B = sc.nextInt();
        sc.nextLine();
        C = sc.nextInt();
        sc.nextLine();
        D = sc.nextInt();

        int produtoAB = A * B;
        int produtoCD = C * D;
        int diferenca = (A * B)-(C * D);
        sc.close();

        System.out.println("Diferença = "+ diferenca);
    }
}
