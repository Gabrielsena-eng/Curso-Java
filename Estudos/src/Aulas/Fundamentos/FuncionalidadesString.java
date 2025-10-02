package Aulas.Fundamentos;

import java.nio.charset.StandardCharsets;

public class FuncionalidadesString {
    public static void main(String[] args) {

        String original = "abcdxe ABCDE  bc     ";

        String s01 = original.toUpperCase();
        String s02 = original.toLowerCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "xy");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        System.out.println(s01 + "-");
        System.out.println(s02 + "-");
        System.out.println(s03 + "-");
        System.out.println(s04 + "-");
        System.out.println(s06 + "-");
        System.out.println(s07 + "-");
        System.out.println(i);
        System.out.println(j);

        String s = "Gabriel Sena De Albuquerque";

        String [] vect = s.split(" ");

        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
        System.out.println(vect[3]);

        String x = "OlaMundo";
        int t = x.length();
         char [] quantidade = new char[x.length()];
        for (int k = 0; k < x.length(); k++) {
                quantidade[k] = x.charAt(k);
            System.out.println(quantidade[k]);
        }
        }

    }

