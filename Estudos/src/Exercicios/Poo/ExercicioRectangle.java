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

        System.out.println("Area = " + rectangle.AreaRectangle());
        System.out.println("Perimeter = " + rectangle.Perimeter());
        System.out.println("Diagonal = " + rectangle.Diagonal());
    }
}
