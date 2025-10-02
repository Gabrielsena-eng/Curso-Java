package Aulas.Poo.Entietes;

public class CalculatorDolar {
    public static Double IOF = 0.06;

    public static double Converter(double dollar, double dollarPrice){
        return( dollar + dollar * IOF) * dollarPrice;
    }
}
