package Exercicios.calculos;

import java.util.Scanner;

public class Funcao_2grau {
    public static void main(String[] args) {
        //Resolva equações do segundo Grau x2 = 2x - 3.
        Scanner sc = new Scanner(System.in);
         double A, B, C;
        System.out.println("Digite o número de A: ");
        A = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o número de B: ");
        B = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o número de C: ");
        C = sc.nextInt();
        sc.close();

        double delta;
        delta = Math.pow(- B , 2) - 4 * A * C;
        System.out.println(delta);
        double x1, x2;
        x1 = (-B + Math.sqrt(delta))/( 2 * A);
        x2 = (-B - Math.sqrt(delta))/( 2 * A);
        if (delta < 0){
            System.out.println("A função não possui raizes");
        } else if (delta > 0) {
            System.out.println("As raizes da sua função são:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }else {
            System.out.println("Sua função possui apenas uma raiz");
            System.out.println("A raiz da sua função é: " + x1);
            System.out.println(Math.sqrt(delta));
        }
        System.out.println(Math.sqrt(delta));
    }
}
