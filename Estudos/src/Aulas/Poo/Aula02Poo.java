package Aulas.Poo;

import Aulas.Poo.Entietes.Product;

import javax.xml.namespace.QName;
import java.util.Locale;
import java.util.Scanner;

public class Aula02Poo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Product produto;
        produto = new Product();
        double total = produto.TotalValueInStock();

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        produto.name = sc.next();
        System.out.print("Price: ");
        produto.price = sc.nextDouble();
        System.out.print("Quantity: ");
        produto.quantity = sc.nextInt();

        System.out.printf("Product data: %s, $%,2f, %d units, Total: $%.2f.%n", produto.name,produto.price,produto.quantity,total);


        sc.close();
    }
}
