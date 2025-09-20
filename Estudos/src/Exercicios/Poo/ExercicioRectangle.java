package Exercicios.Poo;

import Exercicios.Poo.Entietes.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioRectangle {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        double area = rectangle.AreaRectangle();
        System.out.println("Area = " + area);
        double perimeter = rectangle.Perimeter();
        System.out.println("Perimeter = " + perimeter);
        double diagonal = rectangle.Diagonal();
        System.out.println("Diagonal = " + diagonal);
    }
}
