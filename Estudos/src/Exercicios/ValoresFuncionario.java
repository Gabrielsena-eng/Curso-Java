package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ValoresFuncionario {
    public static void main(String[] args) {
        //Sem Programação a objeto

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int numero;
        double horas, valorhora, salario;

        System.out.println("Digite o seu número de funcionario:");
        numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite suas horas mensais: ");
        horas = sc.nextDouble();
        sc.nextLine();
        System.out.println("Digite quanto você receb por Valor/hora: ");
        valorhora = sc.nextDouble();
        sc.close();

        salario = horas * valorhora;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f.%n", salario);
        sc.close();
    }
}
