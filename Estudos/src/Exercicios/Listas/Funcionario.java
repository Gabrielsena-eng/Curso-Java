package Exercicios.Listas;

public class Funcionario {
    private Integer id;
    private String name;
    private Double salary;


    public Funcionario(){
    }

    public Funcionario(Integer id, String name, Double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double increaseSalary(double porcentagem){
        return salary +=   (porcentagem / 100) * salary;
    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + String.format("%.2f", salary);

    }
}
