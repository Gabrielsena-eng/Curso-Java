package Aulas.Poo;

import Aulas.Poo.Entietes.Product;

import java.util.Locale;
import java.util.Scanner;

public class Aula02Product {
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

        System.out.println();
        System.out.println("Product Data: " + produto);

        System.out.println();
        System.out.print("Enter number of products to be added in stock: ");
        int quantity = sc.nextInt();
        produto.AddProducts(quantity);

        System.out.println();
        System.out.println("Update Data: " + produto);
        System.out.println();

        System.out.print("Enter number of products to be remove in stock: ");
        quantity = sc.nextInt();
        produto.RemoveProducts(quantity);
        System.out.println();
        System.out.println("Update Data: " + produto);



        sc.close();
    }
}
