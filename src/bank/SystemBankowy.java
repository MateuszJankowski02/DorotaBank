package bank;

import java.util.Random;

public class SystemBankowy {

        public static void main(String[] args) {
                Users users = new Users();
                users.addUser(new User("johnDoe123", "pass123", "John", "Doe", "john.doe@example.com", 30, "Male", "123 Main St"));
                users.addUser(new User("janeSmith456", "pass456", "Jane", "Smith", "jane.smith@example.com", 25, "Female", "456 Oak St"));
                users.addUser(new User("aliceJohnson789", "pass789", "Alice", "Johnson", "alice.johnson@example.com", 35, "Female", "789 Elm St"));
                users.addUser(new User("bobWilliams987", "pass987", "Bob", "Williams", "bob.williams@example.com", 40, "Male", "987 Pine St"));
                users.addUser(new User("charlieBrown654", "pass654", "Charlie", "Brown", "charlie.brown@example.com", 28, "Male", "654 Cedar St"));
                users.addUser(new User("evaWhite321", "pass321", "Eva", "White", "eva.white@example.com", 22, "Female", "321 Birch St"));
                users.addUser(new User("frankTaylor234", "pass234", "Frank", "Taylor", "frank.taylor@example.com", 32, "Male", "234 Maple St"));
                users.addUser(new User("graceClark876", "pass876", "Grace", "Clark", "grace.clark@example.com", 27, "Female", "876 Walnut St"));
                users.addUser(new User("davidMiller543", "pass543", "David", "Miller", "david.miller@example.com", 38, "Male", "543 Spruce St"));

                Logowanie logowanie = new Logowanie(users);

                User user = logowanie.zaloguj("johnDoe123", "pass123");
                user.dodajRachunek(1000, "Checking");
                Rachunek nowyRachunek = user.getRachunek(0);
                Przelew przelew = new Przelew(nowyRachunek, "987654321", "Rent Payment", "Regular", 150);
                user.WykonajPrzelew(przelew);
                logowanie.wyloguj();

                User user2 = logowanie.zaloguj("janeSmith456", "pass456");
                user2.dodajRachunek(500, "Savings");
                Rachunek nowyRachunek2 = user2.getRachunek(0);
                Przelew przelew2 = new Przelew(nowyRachunek2, "123456789", "Utility Bill", "Regular", 50);
                user2.WykonajPrzelew(przelew2);
                logowanie.wyloguj();

                User user3 = logowanie.zaloguj("aliceJohnson789", "pass789");
                user3.dodajRachunek(8000, "Investment");
                Rachunek nowyRachunek3 = user3.getRachunek(0);
                Przelew przelew3 = new Przelew(nowyRachunek3, "456789123", "Loan Repayment", "Regular", 200);
                user3.WykonajPrzelew(przelew3);
                logowanie.wyloguj();

                User user4 = logowanie.zaloguj("bobWilliams987", "pass987");
                user4.dodajRachunek(200, "Emergency Fund");
                Rachunek nowyRachunek4 = user4.getRachunek(0);
                System.out.println(nowyRachunek4.getSaldo());
                nowyRachunek4.getHistoriaPrzelewow();
                Przelew przelew4 = new Przelew(nowyRachunek4, "654321987", "Grocery Shopping", "Regular", 60);
                System.out.println(przelew4.obliczSaldopoPrzelewie());
                user4.WykonajPrzelew(przelew4);
                logowanie.wyloguj();
        }
}
