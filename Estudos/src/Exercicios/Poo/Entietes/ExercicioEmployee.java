package Exercicios.Poo.Entietes;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioEmployee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Employee funcionario = new Employee();

        System.out.print("Name: ");
        funcionario.Name = sc.next();
        sc.nextLine();
        System.out.print("GloosSalary: ");
        funcionario.GlossSalary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Tax: ");
        funcionario.Tax = sc.nextDouble();
        System.out.println(funcionario);//nome e salario liquido;

        System.out.println("Percentage");
        double percentage = funcionario.increaseSalary(sc.nextDouble());//porcentagem de aumento

        System.out.println(funcionario);// nome e salario liquido, com reajuste de porcentagem no salario bruto


    }
}
