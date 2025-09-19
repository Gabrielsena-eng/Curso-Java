package Aulas.Poo;

import java.util.Scanner;

public class Aula01Poo {
    public static void main(String[] args) {
        /*descobrir a area de um triangulo somente com as medias dos lados, e comparar a are com outro triangulo*/
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Os lados do triangulo X");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Os lados do triangulo Y");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = area(x.a, x.b, x.c);
        double areaY = area(y.a, y.b, y.c);

        System.out.printf("Area de X = %.4f.%n", areaX);
        System.out.printf("Area de Y = %.4f.%n", areaY);

        double Valor = Maior(areaX, areaY);
        Resultado(Valor);
    }
    public static double Maior(double x, double y){
        char numeroMaior;
        if (x > y){
            numeroMaior = 'X';
        } else {
            numeroMaior = 'Y';
        }
        return numeroMaior;
    }

    public static double area(double a, double b, double c){
        double p = (a + b + c)/ 2;
        double abc = Math.sqrt((p* (p-a) * (p-b) * (p-c) ));
        return abc;
    }

    public static void Resultado(double visue){

        System.out.println("A area maior é a do " + visue);
    }
}
