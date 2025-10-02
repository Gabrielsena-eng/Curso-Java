package Exercicios.Poo;

import Exercicios.Poo.Entietes.ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioBanco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int numberAccount = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String holderAccount = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        char deposit = sc.nextLine().charAt(0);

       ContaBanco p2 = new ContaBanco();
        System.out.println(p2);
        ContaBanco conta = new ContaBanco();

        if (deposit == 'y'){
            System.out.print("Enter initial deposit value: ");
            double valorDepositado = sc.nextDouble();
           conta = new ContaBanco(numberAccount, holderAccount, valorDepositado );
        }
        else {
            conta = new ContaBanco(numberAccount, holderAccount);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(conta);
        System.out.println();

        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        conta.addValue(depositValue);
        System.out.println("Updated account data:");
        System.out.println(conta);
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        conta.removeValue(withdrawValue);
        System.out.println("Updated account data:");
        System.out.println(conta);
        sc.close();
    }
}
