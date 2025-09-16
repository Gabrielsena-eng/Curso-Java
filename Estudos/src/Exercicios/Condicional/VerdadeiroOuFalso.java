package Exercicios.Condicional;

import java.util.Scanner;

public class VerdadeiroOuFalso {
    public static void main(String[] args) {

        //Valor negativo ou não negativo;
        Scanner sc = new Scanner(System.in);
        int numero;
        numero = sc.nextInt();

        if (numero < 0){
            System.out.println("Negativo");
        }else {
            System.out.println("Não negativo");
        }

        //Exercicio 2: Par ou impar
        int x;
        x = sc.nextInt();

        if ( x % 2 == 0){
            System.out.println("Par");
        }else {
            System.out.println("Impar");
        }

        //Exercicio 3 - Múltiplos ou não;
        int num1, num2;

        System.out.println("Digite o primeiro número");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo número");
        num2 = sc.nextInt();
       if (num1 % num2 == 0 || num2 % num1 == 0){
           System.out.println("Os números são multiplos");
       }else {
           System.out.println("Os números não são multiplos");
       }


       //Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
        //começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

        int horaInicial, horaFinal;
        int tempoDoJogo = 0;
        System.out.println("quakquer");
        horaInicial = sc.nextInt();
        horaFinal = sc.nextInt();


       //Calculo dia - HoraMaior + hora menor;

        if (horaInicial > horaFinal  ){
            tempoDoJogo = 24 - horaInicial + horaFinal;
        }
        else{
            tempoDoJogo = 24 - horaFinal + horaInicial;
        }

        System.out.println(tempoDoJogo);

        sc.close();
    }
}
