package Aulas.Poo.Aulas;

import Aulas.Poo.Entietes.CalculatorDolar;

import java.util.Locale;
import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double dollar = sc.nextDouble();

        double pagarReais = CalculatorDolar.Converter(dollar, dollarPrice);
        System.out.printf("Amount to be paid in reais = R$ %.2f%n", pagarReais);
    }
}
