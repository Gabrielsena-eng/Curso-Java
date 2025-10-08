package Exercicios.Listas;

import java.util.*;

public class FuncionarioList {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        List<Funcionario> list = new ArrayList<>();

        System.out.println();
        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        System.out.println();

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Name; ");
            String name = sc.next();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            System.out.println();

            Funcionario funcionario = new Funcionario(id, name, salary);
            list.add(funcionario);

        }
        System.out.print("Digite o id do funcionario: ");
        int idFuncionario = sc.nextInt();

        Integer posicao = positionId(list, idFuncionario);

        if (posicao != null){
            System.out.print("Digite quantos porcento você quer aumentar no salario: ");
            double porcentagem = sc.nextDouble();;
            list.get(posicao).increaseSalary(porcentagem);
        }else{
            System.out.println("This id does not exist!");
        }

        for (Funcionario e : list){
            System.out.println(e);
        }

    }

    public static Integer positionId(List<Funcionario> list, int id){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId() == id ){
                return i;
            }
        }
       return null;
    }
}
