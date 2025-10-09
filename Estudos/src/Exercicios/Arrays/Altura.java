package Exercicios.Arrays;

import java.util.Locale;
import java.util.Scanner;

public class Altura {
    public static void main(String[] args) {
        /*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
        tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
                bem como os nomes dessas pessoas caso houver.*/
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pesssoas serão digitadas? ");
        int n = sc.nextInt();
        Pessoa [] pessoa = new Pessoa[n];

        double menor16 = 0;
        for (int i = 0; i < pessoa.length; i++) {
            int y = 1 + i;
            sc.nextLine();
            System.out.println("Dados da " + y +"a pessoa:");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            pessoa[i] = new Pessoa(nome, idade, altura);

            if (idade < 16){
                menor16 += 1;
            }
            else {

            }
        }
        menor16 = (menor16 / n) * 100;
        double soma = 0.0;
        for (int i = 0; i < pessoa.length; i++) {
            soma +=  pessoa[i].getAltura();
        }

        double media = soma / n;

        System.out.println();
        System.out.printf("Altura Media: %.2f/n", media);
        System.out.printf("Pessoas com menos de 16 anos é:  %.1f%%n", menor16);
        for (int i = 0; i < pessoa.length; i++) {
            if (pessoa[i].getIdade() < 16){
                System.out.println(pessoa[i].getNome());
            }
        }
        
        sc.close();
    }
}
