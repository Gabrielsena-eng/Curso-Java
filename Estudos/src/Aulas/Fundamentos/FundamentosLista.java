package Aulas.Fundamentos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FundamentosLista {
    public static void main(String[] args) {

       List<String> list = new ArrayList<>();

       list.add("Maria");
       list.add("Luis");
       list.add("Mario");
       list.add("Luana");
       list.add("Rebeka");
       list.add("Leticia");
       list.add(2, "Raul");

       list.remove("Mario");

       System.out.println(list.size());
       for(String x: list){
           System.out.println(x);
       }

       System.out.println("-----------------");
       list.removeIf(x -> x.charAt(0) == 'R');
       for (String x : list) {
           System.out.println(x);
       }

        System.out.println("----------------");
        System.out.println("Index of Luis: " + list.indexOf("Luis"));

        System.out.println("------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'L').collect(Collectors.toList());
        for(String x : result){
            System.out.println(x);
        }
        //Operações de lambida, ele converte para String depois retorna para List

        System.out.println("-------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }
}
