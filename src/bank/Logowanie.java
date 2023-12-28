// napisz klasę logowanie, która będzie weryfikować poprawność danych logowania
// klasa logowanie powinna zawierać metodę zaloguj, która będzie zwracać użytkownika
// klasa logowanie powinna zawierać metodę wyloguj, która będzie zwracać użytkownika
// klasa powinna zawierac atrybut: aktulany użytkownik

package bank;

public class Logowanie {

    private Users users;
    private static User aktualnyUzytkownik;

    public Logowanie(Users users) {
        this.users = users;
    }

    public User zaloguj(String login, String haslo) {
        User user = users.findUserLogin(login);
        if (user != null && user.getHaslo().equals(haslo)) {
            aktualnyUzytkownik = user;
            System.out.println("Zalogowano użytkownika: " + user.getLogin());
            return user;
        }
        System.out.println("Niepoprawne dane logowania");
        return null;
    }

    public void wyloguj() {
        if (aktualnyUzytkownik == null) {
            System.out.println("Nie ma zalogowanego użytkownika");
            return;
        }
        System.out.println("Wylogowano użytkownika: " + aktualnyUzytkownik.getLogin());
        aktualnyUzytkownik.setCzyZalogowany(false);
        aktualnyUzytkownik = null;
    }

    public User getAktualnyUzytkownik() {
        return aktualnyUzytkownik;
    }
}
