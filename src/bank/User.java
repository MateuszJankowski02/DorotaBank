package bank;

import java.util.ArrayList;
import java.util.List;

interface UserInterface {

    void WykonajPrzelew(Przelew przelew);

    void setDaneOsobowe(String imie, String nazwisko, String adres, String wiek, String plec);

    void setLogin(String login);

    void setHaslo(String haslo);

    void setImieNazwisko(String imie, String nazwisko);

    void dodajRachunek(double saldo, String typRachunku);

    String toString();
}

/**
 * Klasa reprezentująca rachunek użytkownika.
 */

public class User implements UserInterface{

    private String login;
    private String haslo;
    private String imie;
    private String nazwisko;
    private String email;
    private int wiek;
    private String plec;
    private String adres;
    private boolean czyZalogowany = false;
    private List<Rachunek> rachunki = new ArrayList<>();
    private int numberOfRachunek = 0;

    /**
     * Konstruktor tworzący nowy obiekt użytkownika.
     *
     * @param login    Login użytkownika.
     * @param haslo    Hasło użytkownika.
     * @param imie     Imię użytkownika.
     * @param nazwisko Nazwisko użytkownika.
     * @param email    Email użytkownika.
     * @param wiek     Wiek użytkownika.
     * @param plec     Płeć użytkownika.
     * @param adres    Adres użytkownika.
     */

    public User(String login, String haslo, String imie, String nazwisko, String email, int wiek, String plec, String adres) {
        this.login = login;
        this.haslo = haslo;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.wiek = wiek;
        this.plec = plec;
        this.adres = adres;
    }

    /**
     * Zwraca login użytkownika.
     *
     * @return Login użytkownika.
     */

    protected String getLogin() {
        return login;
    }

    /**
     * Zwraca hasło użytkownika.
     *
     * @return Hasło użytkownika.
     */

    protected String getHaslo() {
        return haslo;
    }

    /**
     * Zwraca informację o tym, czy użytkownik jest zalogowany.
     * @return Informacja o tym, czy użytkownik jest zalogowany.
     */


    private boolean getCzyZalogowany() {
        return czyZalogowany;
    }

    /**
     * Ustawia dane osobowe użytkownika.
     * @param imie Imię użytkownika.
     * @param nazwisko Nazwisko użytkownika.
     * @param adres Adres użytkownika.
     * @param wiek Wiek użytkownika.
     * @param plec Płeć użytkownika.
     */

    @Override
    public void setDaneOsobowe(String imie, String nazwisko, String adres, String wiek, String plec) {
        if (!getCzyZalogowany()) {
            System.out.println("Nie jesteś zalogowany");
            return;
        }
        if (imie != null) this.imie = imie;
        if (nazwisko != null) this.nazwisko = nazwisko;
        if (adres != null) this.adres = adres;
        if (wiek != null) this.wiek = Integer.parseInt(wiek);
        if (plec != null) this.plec = plec;
    }

    /**
     * Ustawia login użytkownika.
     * @param login Login użytkownika.
     */

    @Override
    public void setLogin(String login) {
        if (!getCzyZalogowany()) {
            System.out.println("Nie jesteś zalogowany");
            return;
        }
        if (login.length() < 5) {
            System.out.println("Login musi mieć minimum 5 znaków");
            return;
        }
        if (login.equals(this.login)) {
            System.out.println("Login nie może być taki sam jak poprzedni");
            return;
        }
        this.login = login;
    }

    /**
     * Ustawia hasło użytkownika.
     * @param haslo Hasło użytkownika.
     */

    @Override
    public void setHaslo(String haslo) {
        if (!getCzyZalogowany()) {
            System.out.println("Nie jesteś zalogowany");
            return;
        }
        if (haslo.length() < 8) {
            System.out.println("Hasło musi mieć minimum 8 znaków");
            return;
        }
        if (haslo.equals(this.haslo)) {
            System.out.println("Hasło nie może być takie samo jak poprzednie");
            return;
        }
        this.haslo = haslo;
    }

    /**
     * Ustawia imię i nazwisko użytkownika.
     * @param imie Imię użytkownika.
     * @param nazwisko Nazwisko użytkownika.
     */

    @Override
    public void setImieNazwisko(String imie, String nazwisko) {
        if (!getCzyZalogowany()) {
            System.out.println("Nie jesteś zalogowany");
            return;
        }
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    /**
     * Wykonuje przelew.
     * @param przelew Przelew.
     */

    @Override
    public void WykonajPrzelew(Przelew przelew) {
        if (!getCzyZalogowany()) {
            System.out.println("Nie jesteś zalogowany");
            return;
        }
        if (przelew.getRachunek() == null) {
            System.out.println("Nie znaleziono rachunku");
            return;
        }

        if (przelew.obliczSaldopoPrzelewie() < 0.0) {
            System.out.println("Nie masz wystarczających środków na koncie");
            return;
        }

        System.out.println("Saldo: " + przelew.obliczSaldopoPrzelewie());
        przelew.getRachunek().setSaldo(przelew.obliczSaldopoPrzelewie());
        przelew.getRachunek().addPrzelew(przelew);
        System.out.println("Przelew wykonany");
        System.out.println("Saldo po przelewie: " + przelew.getRachunek().getSaldo());
    }

    /**
     * Dodaje rachunek.
     * @param saldo Saldo rachunku.
     * @param typRachunku Typ rachunku.
     */

    @Override
    public void dodajRachunek(double saldo, String typRachunku) {
        if (!getCzyZalogowany()) {
            System.out.println("Nie jesteś zalogowany");
            return;
        }
        Rachunek rachunek = new Rachunek(saldo, typRachunku);
        rachunki.add(rachunek);
    }

    /**
     * Zwraca rachunek o podanym indeksie.
     * @param index Indeks rachunku.
     * @return Rachunek o podanym indeksie.
     */

    public Rachunek getRachunek(int index) {
        return rachunki.get(index);
    }

    /**
     * Ustawia czy użytkownik jest zalogowany.
     * @param czyZalogowany Informacja o tym, czy użytkownik jest zalogowany.
     */

    protected void setCzyZalogowany(boolean czyZalogowany) {
        this.czyZalogowany = czyZalogowany;
    }

    /**
     * Zwraca reprezentację tekstową obiektu użytkownika.
     * @return Tekstowa reprezentacja użytkownika.
     */

    @Override
    public String toString() {
        return "Dane użytkownika: \n" +
                "imie: " + imie + "\n" +
                "nazwisko: " + nazwisko + "\n" +
                "email: " + email + "\n" +
                "wiek: " + wiek + "\n" +
                "plec: " + plec + "\n" +
                "adres: " + adres + "\n";

    }
}