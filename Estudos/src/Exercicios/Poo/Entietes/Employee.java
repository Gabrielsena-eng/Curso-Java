package Exercicios.Poo.Entietes;

public class Employee {
    public String Name;
    public double GlossSalary;
    public double Tax;

    public double NetSalary(){
        return GlossSalary - Tax;
    }
    public double increaseSalary(double percentage){
         percentage /= 100;
        return GlossSalary += (GlossSalary * percentage);
    }
    public String toString(){

        return Name + ", $ " + String.format("%.2f", NetSalary());
    }
}
