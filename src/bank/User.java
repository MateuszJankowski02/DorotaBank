// zdefiniuj klase bank.User, która będzie przechowywać dane użytkownika do późniejszego użytku
// klasa bank.User powinna zawierać gettery
// klasa bank.User powinna zawierać konstruktor
// klasa bank.User powinna zawierać metodę toString
// klasa bank.User powinna zawierać atrybuty: login, hasło, imię, nazwisko, email, wiek, płeć, adres, numer rachunku bankowego, czy jest zalogowany
// numer konta bankowego, typ rachunku bankowego
// klasa bank.User powinna zawierać settery: zmień hasło, zmień adres, zmień login, zmień dane osobowe
// setterów można użyć tylko wtedy jak użytkownik jest zalogowany
// wszystko udokumentuj za pomocą JavaDoc
package bank;

public class User {

    private String login;
    private String haslo;
    private String imie;
    private String nazwisko;
    private String email;
    private int wiek;
    private String plec;
    private String adres;
    private String numerRachunku;
    private boolean czyZalogowany;
    private String typRachunku;

    public User(String login, String haslo, String imie, String nazwisko, String email, int wiek, String plec, String adres, String numerRachunku, boolean czyZalogowany, String typRachunku) {
        this.login = login;
        this.haslo = haslo;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.wiek = wiek;
        this.plec = plec;
        this.adres = adres;
        this.numerRachunku = numerRachunku;
        this.czyZalogowany = czyZalogowany;
        this.typRachunku = typRachunku;
    }

    private String getLogin() {
        return login;
    }

    private String getHaslo() {
        return haslo;
    }

    private String getImie() {
        return imie;
    }

    private String getNazwisko() {
        return nazwisko;
    }

    private String getEmail() {
        return email;
    }

    private int getWiek() {
        return wiek;
    }

    private String getPlec() {
        return plec;
    }

    private String getAdres() {
        return adres;
    }

    private String getNumerRachunku() {
        return numerRachunku;
    }

    private boolean getCzyZalogowany() {
        return czyZalogowany;
    }

    private String getTypRachunku() {
        return typRachunku;
    }

    private void setDaneOsobowe(String imie, String nazwisko, String email, String wiek, String plec) {
        if (!getCzyZalogowany()) {
            System.out.println("Nie jesteś zalogowany");
            return;
        }
        if(imie != null) this.imie = imie;
        if(nazwisko != null) this.nazwisko = nazwisko;
        if(email != null) this.email = email;
        if(wiek != null) this.wiek = Integer.parseInt(wiek);
        if(plec != null) this.plec = plec;
    }

    private void setLogin(String login) {
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

    private void setHaslo(String haslo) {
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

    private void setImieNazwisko(String imie, String nazwisko) {
        if (!getCzyZalogowany()) {
            System.out.println("Nie jesteś zalogowany");
            return;
        }
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "Dane użytkownika: \n" +
                "imie: " + imie + "\n" +
                "nazwisko: " + nazwisko + "\n" +
                "email: " + email + "\n" +
                "wiek: " + wiek + "\n" +
                "plec: " + plec + "\n" +
                "adres: " + adres + "\n" +
                "numerRachunku: " + numerRachunku + "\n" +
                "typRachunku: " + typRachunku + "\n";
    }
}