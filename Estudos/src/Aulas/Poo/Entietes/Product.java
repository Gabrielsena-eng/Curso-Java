package Aulas.Poo.Entietes;

public class Product {
     private String name;
     private double price;
     private int quantity;


    public void setPrice(double price) {
        this.price = price;
    }

    public Product(String name, double price, int quantity){
        this.name = name;//Forma de chamar o objeto
        this.quantity = quantity;
        this.price = price;
    }
    public Product(String name, double price){//Sobrecarga
        this.name = name;//Forma de chamar o objeto
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Double getPrice(){
        return price;
    }

    public void SetPrice(double price){
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
    }

    public double TotalValueInStock(){
        return price * quantity;
    }
    public void AddProducts(int quantity){
        this.quantity += quantity;
    }
    public void RemoveProducts(int quantity){
        this.quantity -= quantity;
    }
    public String toString(){
        return name + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity + " units, Total: $ "
                + String.format("%.2f", TotalValueInStock());
    }
}
