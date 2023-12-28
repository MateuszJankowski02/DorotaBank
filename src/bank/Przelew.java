package bank;
public class Przelew {

    private String kontoOdbiorcy;
    private String tytulPrzelewu;
    private String rodzajPrzelewu;
    private String saldoPoPrzelewie;

    public Przelew(String kontoOdbiorcy, String tytulPrzelewu, String rodzajPrzelewu, String saldoPoPrzelewie) {
        this.kontoOdbiorcy = kontoOdbiorcy;
        this.tytulPrzelewu = tytulPrzelewu;
        this.rodzajPrzelewu = rodzajPrzelewu;
        this.saldoPoPrzelewie = saldoPoPrzelewie;
    }

    public String getKontoOdbiorcy() {
        return kontoOdbiorcy;
    }

    public String getTytulPrzelewu() {
        return tytulPrzelewu;
    }

    public String getRodzajPrzelewu() {
        return rodzajPrzelewu;
    }

    public String getSaldoPoPrzelewie() {
        return saldoPoPrzelewie;
    }

    @Override
    public String toString() {
        return "bank.Przelew: " +
                "konto Odbiorcy='" + kontoOdbiorcy + '\'' +
                ", tytul Przelewu='" + tytulPrzelewu + '\'' +
                ", rodzaj Przelewu='" + rodzajPrzelewu + '\'' +
                ", saldo Po Przelewie='" + saldoPoPrzelewie + '\'';
    }
}
