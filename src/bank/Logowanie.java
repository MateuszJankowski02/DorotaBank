package bank;

interface LogowanieInterface {

    User zaloguj(String login, String haslo);

    void wyloguj();

    User getAktualnyUzytkownik();
}

/**
 * Klasa służąca do logowania użytkowników.
 */

public class Logowanie implements LogowanieInterface{

    private Users users;
    private static User aktualnyUzytkownik;

    /**
     *
     * Konstruktor tworzący nowy obiekt logowania.
     * @param users Lista użytkowników.
     *
     */

    public Logowanie(Users users) {
        this.users = users;
    }

    /**
     * Metoda służąca do logowania użytkownika.
     * @param login Login użytkownika.
     * @param haslo Hasło użytkownika.
     * @return Zalogowany użytkownik.
     */

    @Override
    public User zaloguj(String login, String haslo) {
        User user = users.findUserLogin(login);
        if (user != null && user.getHaslo().equals(haslo)) {
            aktualnyUzytkownik = user;
            aktualnyUzytkownik.setCzyZalogowany(true);
            System.out.println("Zalogowano użytkownika: " + user.getLogin());
            return user;
        }
        System.out.println("Niepoprawne dane logowania");
        return null;
    }

    /**
     * Metoda służąca do wylogowania użytkownika.
     */

    @Override
    public void wyloguj() {
        if (aktualnyUzytkownik == null) {
            System.out.println("Nie ma zalogowanego użytkownika");
            return;
        }
        System.out.println("Wylogowano użytkownika: " + aktualnyUzytkownik.getLogin());
        aktualnyUzytkownik.setCzyZalogowany(false);
        aktualnyUzytkownik = null;
    }

    /**
     * Metoda zwracająca aktualnie zalogowanego użytkownika.
     * @return Aktualnie zalogowany użytkownik.
     */

    @Override
    public User getAktualnyUzytkownik() {
        return aktualnyUzytkownik;
    }
}
