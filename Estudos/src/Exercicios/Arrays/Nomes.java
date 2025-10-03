package Exercicios.Arrays;

import java.util.Objects;
import java.util.Scanner;

public class Nomes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     //Digite N nomes e encontre qual a posição do nome que você quer encontrar

        int n = sc.nextInt();
        String [] nome = new String[n];

        for (int i = 0; i < nome.length ; i++) {
            nome[i] = sc.nextLine();

        }

        String numeroNome = sc.nextLine();

        for (int i = 0; i < nome.length; i++) {
            if (Objects.equals(numeroNome.toLowerCase(), nome[i].toLowerCase())){
                i += 1;
                System.out.println("O numero na ordem é : " + i);
                break;
            }
        }



        sc.close();
    }
}
