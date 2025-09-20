package Exercicios.Poo;

import Exercicios.Poo.Entietes.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class ExercioAluno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        aluno.nome = sc.nextLine();
        aluno.notaPrimeiroSemestre = sc.nextDouble();
        aluno.notaSegundoSemestre = sc.nextDouble();
        aluno.notaTerceiroSemestre = sc.nextDouble();

        double notaFinal = aluno.NotaFinal();
        double missing;

        System.out.printf("Final grade = %.2f.%n", notaFinal);

        if (notaFinal < 60){
             missing = 60 - notaFinal;
            System.out.println("Faleid");
            System.out.printf("Missing %.2f Points", missing);
        }
        else{
            System.out.println("Pass");
        }
        sc.close();
    }
}
