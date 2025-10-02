package Exercicios.Poo.Entietes;

public class ContaBanco {
    private int numberAccount;
    private String holderAccount;
    private double ValueInAccount;

    public ContaBanco() {
    }

    public ContaBanco(int numberAccount, String holderAccount, double initialValue) {
        this.numberAccount = numberAccount;
        this.holderAccount = holderAccount;
        addValue(initialValue);
    }

    public ContaBanco(int numberAccount, String holderAccount) {
        this.numberAccount = numberAccount;
        this.holderAccount = holderAccount;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public String getHolderAccount() {
        return holderAccount;
    }

    public void setHolderAccount(String holderAccount) {
        this.holderAccount = holderAccount;
    }

    public double getInitialValue() {
        return ValueInAccount;
    }


    public double addValue(double value) {
         return this.ValueInAccount += value;

    }

    public double removeValue(double value){
        return this.ValueInAccount -= (value + 5);
    }

    @Override
    public String toString() {
        return "Account " +
                  numberAccount + ", Holder: "
                + holderAccount + ", "
                + "Balance: $ " + String.format("%.2f", ValueInAccount);
    }
}

