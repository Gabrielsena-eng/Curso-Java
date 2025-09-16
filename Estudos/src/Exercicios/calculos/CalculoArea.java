package Exercicios.calculos;

import java.util.Locale;
import java.util.Scanner;

public class CalculoArea {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double A, B, C;
        double areaTrianguloRetangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
        Scanner sc = new Scanner(System.in);

        Locale.setDefault(Locale.US);
        A = sc.nextDouble();
        sc.nextLine();
        B = sc.nextDouble();
        sc.nextLine();
        C = sc.nextDouble();
        sc.nextLine();
        sc.close();

        areaTrianguloRetangulo = (A * C)/ 2;
        areaCirculo = (3.14159 * Math.pow(C, 2.0));
        areaTrapezio = ((A + B) * C) / 2;
        areaQuadrado = B * B;
        areaRetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f.%n ", areaTrianguloRetangulo);
        System.out.printf("CIRCULO: %.3f.%n", areaCirculo);
        System.out.println("TRAPEZIO:" + areaTrapezio);
        System.out.println("QUADRADO:" + areaQuadrado);
        System.out.println("RETANGULO:" + areaRetangulo);


    }
}
