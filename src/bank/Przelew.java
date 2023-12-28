package bank;
public class Przelew {

    private String kontoOdbiorcy;
    private String tytulPrzelewu;
    private String rodzajPrzelewu;
    private double kwotaPrzelewu;
    private Rachunek rachunek;
    private int saldoPoPrzelewie;

    public Przelew(Rachunek rachunek, String kontoOdbiorcy, String tytulPrzelewu, String rodzajPrzelewu, double kwotaPrzelewu) {
        this.rachunek = rachunek;
        this.kontoOdbiorcy = kontoOdbiorcy;
        this.tytulPrzelewu = tytulPrzelewu;
        this.rodzajPrzelewu = rodzajPrzelewu;
        this.kwotaPrzelewu = kwotaPrzelewu;
    }

    protected double obliczSaldopoPrzelewie() {
        return rachunek.getSaldo() - kwotaPrzelewu;
    }

    @Override
    public String toString() {
        return "Przelew: " +
                "Konto odbiorcy =" + kontoOdbiorcy +
                ", Tytul przelewu =" + tytulPrzelewu +
                ", Rodzaj przelewu =" + rodzajPrzelewu +
                ", Saldo po przelewie =" + obliczSaldopoPrzelewie() ;
    }

    public String getRodzajPrzelewu() {
        return rodzajPrzelewu;
    }

    public String getKontoOdbiorcy() {
        return kontoOdbiorcy;
    }
}
