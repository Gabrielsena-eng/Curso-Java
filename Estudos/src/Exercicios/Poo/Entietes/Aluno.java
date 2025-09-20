package Exercicios.Poo.Entietes;

public class Aluno {
    public String nome;
    public double notaPrimeiroSemestre;//Vale até 30
    public double notaSegundoSemestre;//Vale até 35
    public double notaTerceiroSemestre;//Vale até 35

    public double NotaFinal(){
        return notaPrimeiroSemestre + notaSegundoSemestre + notaTerceiroSemestre;
    }
}
