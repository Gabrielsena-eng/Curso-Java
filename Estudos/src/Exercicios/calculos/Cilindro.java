package Exercicios.calculos;

public class Cilindro {
    public static void main(String[] args) {

        double altura = 5;
        double raio = 3;
        double pi = 3.14;

       double areaCilindro = areaCilindro(altura, raio, pi);
        System.out.println(areaCilindro);
    }
    public static double areaCirculo(double raio, double pi){
        return pi * Math.pow(raio, 2);
    }
    public  static double perimetroCirculo(double raio, double pi){
        return 2 * pi * raio;
    }

    public static double areaRentagulo(double altura, double largura){
        return largura * altura;
    }
    public static double areaCilindro(double altura, double raio, double pi){
                return 2 * areaCirculo(raio, pi) + areaRentagulo(altura, perimetroCirculo(raio, pi));
    }
}
