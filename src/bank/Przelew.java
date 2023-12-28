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

    public void setKontoOdbiorcy(String kontoOdbiorcy) {
        this.kontoOdbiorcy = kontoOdbiorcy;
    }

    public String getTytulPrzelewu() {
        return tytulPrzelewu;
    }

    public void setTytulPrzelewu(String tytulPrzelewu) {
        this.tytulPrzelewu = tytulPrzelewu;
    }

    public String getRodzajPrzelewu() {
        return rodzajPrzelewu;
    }

    public void setRodzajPrzelewu(String rodzajPrzelewu) {
        this.rodzajPrzelewu = rodzajPrzelewu;
    }

    public String getSaldoPoPrzelewie() {
        return saldoPoPrzelewie;
    }

    public void setSaldoPoPrzelewie(String saldoPoPrzelewie) {
        this.saldoPoPrzelewie= saldoPoPrzelewie;
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
