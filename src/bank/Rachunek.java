package bank;

// zdefiniuj klasę Rachunki, która zawiera saldo, rachunek,numerKonta,historiaTransakcji, rodzajKonta
// klasa Users powinna zawierać gettery i settery
// klasa Users powinna zawierać konstruktor


public class Rachunek{
    private double saldo;
    private String typRachunku;
    private Przelew[] historiaPrzelewow;
    int numberOfPrzelew = 0;

    public Rachunek (double saldo, String typRachunku) {
        this.saldo = saldo;
        this.typRachunku = typRachunku;
    }

    protected double getSaldo() {
        return saldo;
    }

    protected String getTypRachunku() {
        return typRachunku;
    }

    protected void getHistoriaPrzelewow() {
        for (int i = 0; i < historiaPrzelewow.length; i++) {
            System.out.println("Przelew numer " + i + ": " + historiaPrzelewow[i].toString());
        }
    }

    protected void addPrzelew(Przelew przelew) {
        this.historiaPrzelewow[numberOfPrzelew] = przelew;
        numberOfPrzelew++;
    }


    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Rachunek:" +
                "saldo = " + saldo +
                ", typRachunku = " + typRachunku;
    }
}