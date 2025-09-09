package Aulas;

public class FuncoesMatematicas {
    public static void main(String[] args) {

        double x = 3.0;
        double y = 5.0;
        double z = -8.0;
        double A, B, C;

        //Math.sqrt( ); Raiz quadrada do número;
        //Math.pow(x , y ); Potenciação;
        //Math.abs( ); Número absoluto;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math. sqrt(30.0);
        System.out.println("A raiz quadrada de " + x + " é igual a " + A);
        System.out.println("A raiz quadrada de " + y + " é igual a " + B);
        System.out.println("A raiz quadrada de 30 é igua a " + C);

        A = Math.pow(x, 7);
        System.out.println(x+ " elevado a " + y + " é igual a " + A);
        A = Math.abs(z);
        System.out.println("O número absoluto de " + z + " é igual a " + A);
    }
}
