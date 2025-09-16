package Aulas;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaDowhile {
    public static void main(String[] args) {
        //do - while
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char repetir;

        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double C = sc.nextDouble();
            double F = 9 * C / 5 + 32;
            System.out.println("A temperatura em F: " + F);
            System.out.print("quer repetir? (s/n):" );
            repetir = sc.next().charAt(0);

        } while (repetir != 'n');
    }
}
