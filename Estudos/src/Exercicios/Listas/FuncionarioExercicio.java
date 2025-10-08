package Exercicios.Listas;

import java.util.*;
import java.util.stream.Collectors;

import Exercicios.Listas.Funcionario;

public class FuncionarioExercicio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        System.out.println();

        Funcionario[] funcionarios = new Funcionario[n];
        ;

        for (int i = 0; i < funcionarios.length; i++) {

            System.out.println("Employeer #" + (i + 1));
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Name; ");
            String name = sc.next();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            System.out.println();

            funcionarios[i] = new Funcionario(id, name, salary);
        }
        //Id do funcionario
        System.out.print("Digite o id do funcionario: ");
        int IdFuncionario = sc.nextInt();

        //Alterando o Valor do do salario do funcionario de acordo com o id
        System.out.print("Digite quantos porcento você quer aumentar no salario: ");


        for (int i = 0; i < funcionarios.length; i++) {
            if (Objects.equals(IdFuncionario, funcionarios[i].getId())) {
                double porcentagem = sc.nextDouble() / 100;
                double salary = funcionarios[i].getSalary() + (funcionarios[i].getSalary() * porcentagem);
                funcionarios[i].setSalary(salary);
                break;
            } else {
                System.out.println("This id does not exist!");
            }

        }
        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println(funcionarios[i]);
        }
        sc.close();
    }
}

