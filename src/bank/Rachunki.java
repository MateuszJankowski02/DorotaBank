package bank;

// zdefiniuj klasę Rachunki, która zawiera saldo, rachunek,numerKonta,historiaTransakcji, rodzajKonta
// klasa Users powinna zawierać gettery i settery
// klasa Users powinna zawierać konstruktor


public class Rachunki{
    private double saldo;
    private String rachunek;
    private String numerKonta;
    private String historiaTransakcji;
    private String rodzajKonta;

    public Rachunki (double saldo, String rachunek, String numerKonta, String historiaTransakcji, String rodzajKonta) {
        this.saldo = saldo;
        this.rachunek = rachunek;
        this.numerKonta = numerKonta;
        this.historiaTransakcji = historiaTransakcji;
        this.rodzajKonta = rodzajKonta;

    }

    public double getSaldo() {
        return saldo;
    }

    public String getRachunek() {
        return rachunek;
    }

    public String getNumerKonta() {
        return numerKonta;
    }

    public String getHistoriaTransakcji() {
        return historiaTransakcji;
    }

    public String getRodzajKonta() {
        return rodzajKonta;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setRachunek(String rachunek) {
        this.rachunek = rachunek;
    }

    public void setNumerKonta(String numerKonta) {
        this.numerKonta = numerKonta;
    }

    public void setHistoriaTransakcji(String historiaTransakcji) {
        this.historiaTransakcji = historiaTransakcji;
    }

    public void setRodzajKonta(String rodzajKonta) {
        this.rodzajKonta = rodzajKonta;
    }


    @Override
    public String toString() {
        return "Rachunek :" +
                "saldo=" + saldo +
                ", rachunek=" + rachunek +
                ", numerKonta=" + numerKonta  +
                ", historiaTransakcji=" + historiaTransakcji +
                ", rodzajKonta=" + rodzajKonta ;
    }
}