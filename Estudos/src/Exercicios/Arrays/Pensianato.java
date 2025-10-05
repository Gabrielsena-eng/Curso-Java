package Exercicios.Arrays;

import java.util.Objects;
import java.util.Scanner;

public class Pensianato {
    public static void main(String[] args) {
        //quarto para estudantes

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        RegistroAluguel [] alunos = new RegistroAluguel[10];
        ;
        //Registro de aluguel do quarto
        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Rent #" + i + ":");
            System.out.print("Nome:");
            String nome = sc.next();
            sc.nextLine();
            System.out.print("Email:");
            String email = sc.nextLine();
            System.out.print("Numero do quarto de 1 a 10: ");
            int NumeroQuarto = sc.nextInt();

            alunos[NumeroQuarto] = new RegistroAluguel(nome, email);
        }

        System.out.println();
        System.out.println("Busy rooms:");
        for (int i = 0; i < 10; i++) {
            if (alunos[i] != null){
                System.out.println(i + ": " + alunos[i]);
            }
        }


        sc.close();
    }
}
