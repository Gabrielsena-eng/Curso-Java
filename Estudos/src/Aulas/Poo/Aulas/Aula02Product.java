package Aulas.Poo.Aulas;

import Aulas.Poo.Entietes.Product;

import java.util.Locale;
import java.util.Scanner;

public class Aula02Product {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);




        System.out.println("Enter product data:");

        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity: ");
        int quantity = sc.nextInt();
        Product produto = new Product(name, price, quantity);

        produto.setName("Computer");
        System.out.println("update name: " + produto.getName());
        produto.SetPrice(2000.0);
        System.out.println("update price: " + produto.getPrice());

        System.out.println();
        System.out.println("Product Data: " + produto);


        System.out.println();
        System.out.print("Enter number of products to be added in stock: ");
        int quantityAdd= sc.nextInt();
        produto.AddProducts(quantityAdd);

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
