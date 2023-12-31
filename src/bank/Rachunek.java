package bank;

import java.util.ArrayList;
import java.util.List;

interface RachunekInterface {

    String toString();
}

/**
 * Klasa reprezentująca rachunek użytkownika.
 */

public class Rachunek implements RachunekInterface{
    private double saldo;
    private String typRachunku;
    private List<Przelew> historiaPrzelewow = new ArrayList<>();
    int numberOfPrzelew = 0;

    /**
     * Konstruktor tworzący nowy obiekt rachunku.
     *
     * @param saldo       Saldo rachunku.
     * @param typRachunku Typ rachunku.
     */

    public Rachunek (double saldo, String typRachunku) {
        this.saldo = saldo;
        this.typRachunku = typRachunku;
    }

    /**
     * Zwraca saldo rachunku.
     *
     * @return Saldo rachunku.
     */

    protected double getSaldo() {
        return saldo;
    }

    /**
     * Zwraca typ rachunku.
     *
     * @return Typ rachunku.
     */

    protected String getTypRachunku() {
        return typRachunku;
    }

    /**
     * Zwraca historię przelewów.
     */

    protected void getHistoriaPrzelewow() {
        for (int i = 0; i < numberOfPrzelew; i++) {
            System.out.println(historiaPrzelewow.get(i));
        }
    }

    /**
     * Dodaje przelew do historii przelewów.
     *
     * @param przelew Przelew do dodania.
     */

    protected void addPrzelew(Przelew przelew) {
        historiaPrzelewow.add(przelew);
        numberOfPrzelew++;
    }

    /**
     * Ustawia saldo rachunku.
     *
     * @param saldo Saldo rachunku.
     */

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Zwraca reprezentację tekstową obiektu rachunku.
     *
     * @return Tekstowa reprezentacja rachunku.
     */

    @Override
    public String toString() {
        return "Rachunek:" +
                "saldo = " + saldo +
                ", typRachunku = " + typRachunku;
    }
}