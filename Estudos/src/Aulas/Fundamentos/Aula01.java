package Aulas.Fundamentos;

import java.util.Locale;

public class Aula01 {
        public static void main(String[] args) {

            double x = 10.3543;
            System.out.println(x);
            System.out.printf("%.2f%n", x);
            System.out.printf("%.4f%n", x);
           // Locale.setDefault(Locale.US);
            System.out.printf("%.2f%n", x);
            System.out.printf("%.4f%n", x);
            System.out.printf("RESULT = %.2f metros%n", x);

            String nome = "Maria";
            int idade = 31;
            double renda = 3500.35;
            System.out.printf("%s tem %d anos e ganha %.2f reais%n", nome, idade, renda);
            System.out.println("_______________________________________________________-");
            //Exercicio

            String product1 = "Computer";
            String product2 = "Office desk";

            int age = 30;
            int code = 5290;
            char gender = 'F';

            double price1 = 4500.0;
            double price2 = 3000.0;
            double measure = 45.2342342242;
//Exercicio
            System.out.println("Products:");
            System.out.printf("%s, which price is $ %.2f.%n", product1, price1);
            System.out.printf("%s, which price is $ %.2f.%n", product2, price2);
            System.out.println();
            System.out.printf("Record: %d years old, code %d and gender: %c.%n", age, code, gender);
            System.out.println();
            System.out.printf("Measue with eight fourten places: %8f.%n", measure);
            System.out.printf("Rouded (three decimal places): %3f.%n", measure);
            Locale.setDefault(Locale.US);
            System.out.printf("US decimal point: %3f.%n", measure);
        }
    }


