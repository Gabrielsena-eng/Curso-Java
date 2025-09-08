import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        //Trapezio
       double htrapezio = 5.0;
        double btrapezio = 6.0;
        double Btrapezio = 8.0;

        double area = (btrapezio + Btrapezio)/ 2 * htrapezio;
        System.out.printf("A área do trapezio é %.1f.", area);


        //sc.next();
        //sc.nextInt();
        //sc.nextDouble();
        //sc.next(). charAt()


        Scanner sc = new Scanner(System.in);
        String x;
        int y;
        double z;
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);


            //QUEBRA DE LINHA COM nextline

        int x1;
        String s1, s2, s3;

        x1 = sc.nextInt();
        sc.nextLine();
        s2 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        sc.close();
    }
}
