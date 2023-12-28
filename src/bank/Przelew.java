package bank;

interface PrzelewInterface {

    String getNumerRachunkuOdbiorcy();

    String toString();
}

/**
 * Klasa reprezentująca operacje związane z przelewem środków.
 */
public class Przelew implements PrzelewInterface{

    private String numerRachunkuOdbiorcy;
    private String tytulPrzelewu;
    private String rodzajPrzelewu;
    private double kwotaPrzelewu;
    private Rachunek rachunek;
    private int saldoPoPrzelewie;

    /**
     * Konstruktor tworzący nowy obiekt przelewu.
     *
     * @param rachunek               Rachunek, z którego dokonywany jest przelew.
     * @param numerRachunkuOdbiorcy  Numer rachunku, na który dokonywany jest przelew.
     * @param tytulPrzelewu          Tytuł przelewu.
     * @param rodzajPrzelewu         Rodzaj przelewu.
     * @param kwotaPrzelewu          Kwota przelewu.
     */
    public Przelew(Rachunek rachunek, String numerRachunkuOdbiorcy, String tytulPrzelewu, String rodzajPrzelewu, double kwotaPrzelewu) {
        this.rachunek = rachunek;
        this.numerRachunkuOdbiorcy = numerRachunkuOdbiorcy;
        this.tytulPrzelewu = tytulPrzelewu;
        this.rodzajPrzelewu = rodzajPrzelewu;
        this.kwotaPrzelewu = kwotaPrzelewu;
    }

    /**
     * Oblicza saldo po dokonaniu przelewu.
     *
     * @return Saldo po dokonaniu przelewu.
     */
    protected double obliczSaldopoPrzelewie() {
        return rachunek.getSaldo() - kwotaPrzelewu;
    }

    /**
     * Zwraca kwotę przelewu.
     *
     * @return Kwota przelewu.
     */

    protected double getKwotaPrzelewu() {
        return kwotaPrzelewu;
    }

    /**
     * Zwraca reprezentację tekstową obiektu przelewu.
     *
     * @return Tekstowa reprezentacja przelewu.
     */
    @Override
    public String toString() {
        return "Przelew: " +
                "Numer rachunku odbiorcy =" + numerRachunkuOdbiorcy +
                ", Tytul przelewu =" + tytulPrzelewu +
                ", Rodzaj przelewu =" + rodzajPrzelewu +
                ", Kwota przelewu =" + kwotaPrzelewu +
                ", Saldo po przelewie =" + obliczSaldopoPrzelewie();
    }

    /**
     * Zwraca rachunek.
     *
     * @return Rachunek.
     */

    protected Rachunek getRachunek () {
        return rachunek;
    }

    /**
     * Zwraca rodzaj przelewu.
     *
     * @return Rodzaj przelewu.
     */
    protected String getRodzajPrzelewu() {
        return rodzajPrzelewu;
    }

    /**
     * Zwraca numer konta odbiorcy.
     *
     * @return Numer konta odbiorcy.
     */

    @Override
    public String getNumerRachunkuOdbiorcy() {
        return numerRachunkuOdbiorcy;
    }
}
