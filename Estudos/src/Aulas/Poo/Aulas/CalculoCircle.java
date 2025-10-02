package Aulas.Poo.Aulas;

import Aulas.Poo.Entietes.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class CalculoCircle {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double area = Calculator.circumference(radius);
        double volume = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", area);
        System.out.printf("Volume: %.2f%n", volume);
        System.out.printf("Pi: %.2f%n", Calculator.PI);
    }
}
