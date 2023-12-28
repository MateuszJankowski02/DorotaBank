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
        user.dodajRachunek(100, "typRachunku1");
        Rachunek nowyRachunek = user.getRachunek(0);
        Przelew przelew = new Przelew(nowyRachunek, "numerRachunkuOdbiorcy1", "tytulPrzelewu1", "rodzajPrzelewu1", 10);
        user.WykonajPrzelew(przelew);
        logowanie.wyloguj();
        User user2 = logowanie.zaloguj("login2", "haslo2");
        user2.dodajRachunek(50, "typRachunku2");
        Rachunek nowyRachunek2 = user2.getRachunek(0);
        Przelew przelew2 = new Przelew(nowyRachunek2, "numerRachunkuOdbiorcy2", "tytulPrzelewu2", "rodzajPrzelewu2", 50);
        user2.WykonajPrzelew(przelew2);
        logowanie.wyloguj();
        User user3 = logowanie.zaloguj("login3", "haslo3");
        user3.dodajRachunek(800, "typRachunku3");
        Rachunek nowyRachunek3 = user3.getRachunek(0);
        Przelew przelew3 = new Przelew(nowyRachunek3, "numerRachunkuOdbiorcy3", "tytulPrzelewu3", "rodzajPrzelewu3", 25);
        user3.WykonajPrzelew(przelew3);
        logowanie.wyloguj();
        User user4 = logowanie.zaloguj("login4", "haslo4");
        user4.dodajRachunek(20, "typRachunku4");
        Rachunek nowyRachunek4 = user4.getRachunek(0);
        System.out.println(nowyRachunek4.getSaldo());
        nowyRachunek4.getHistoriaPrzelewow();
        Przelew przelew4 = new Przelew(nowyRachunek4, "numerRachunkuOdbiorcy4", "tytulPrzelewu4", "rodzajPrzelewu4", 60);
        System.out.println(przelew4.obliczSaldopoPrzelewie());
        user4.WykonajPrzelew(przelew);
        logowanie.wyloguj();

    }

}
