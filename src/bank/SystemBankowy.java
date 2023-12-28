package bank;

public class SystemBankowy {
public static void main(String[] args) {
        Users users = new Users();
        users.addUser(new User("login1", "haslo1", "imie1", "nazwisko1", "email1", 1, "plec1", "adres1"));
        users.addUser(new User("login2", "haslo2", "imie2", "nazwisko2", "email2", 2, "plec2", "adres2"));
        users.addUser(new User("login3", "haslo3", "imie3", "nazwisko3", "email3", 3, "plec3", "adres3"));
        users.addUser(new User("login4", "haslo4", "imie4", "nazwisko4", "email4", 4, "plec4", "adres4"));
        users.addUser(new User("login5", "haslo5", "imie5", "nazwisko5", "email5", 5, "plec5", "adres5"));
        users.addUser(new User("login6", "haslo6", "imie6", "nazwisko6", "email6", 6, "plec6", "adres6"));
        users.addUser(new User("login7", "haslo7", "imie7", "nazwisko7", "email7", 7, "plec7", "adres7"));
        users.addUser(new User("login8", "haslo8", "imie8", "nazwisko8", "email8", 8, "plec8", "adres8"));
        users.addUser(new User("login9", "haslo9", "imie9", "nazwisko9", "email9", 9, "plec9", "adres9"));

        Logowanie logowanie = new Logowanie(users);
        User user = logowanie.zaloguj("login1", "haslo1");
    }

}
