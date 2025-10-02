package Aulas.Fundamentos;

import java.util.Scanner;

public class EstruturaCondicional {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double hora;
        hora = sc.nextDouble();
     if ( hora > 4 && hora < 12 ) {
         System.out.println("Bom dia");
     }else if (hora >=12 && hora <18) {
         System.out.println("Boa Tarde");
     }else {
         System.out.println("Boa noite");
     }

     sc.close();
    }
}
