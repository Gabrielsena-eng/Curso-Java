package Aulas;


import java.util.Scanner;

public class EstruturaDeRepeticao {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

       // int numero = sc.nextInt();
        int soma = 0;
        //while (numero != 0){
        //    soma = soma + numero;
        //    numero = sc.nextInt();
        //}

        int x, y;
        x = 0;
        y = 4;

        while(x < 3){
            y += 2;
            x += 1;
            System.out.println(x + "-" + y);
        }
        int N;
        soma = 0;
        N = sc.nextInt();
        for (int i = 0; i < N ; i++) {
            int z = sc.nextInt();
            soma += z;
        }
        System.out.println(soma);
    }
}