// zdefiniuj klasę Users, która będzie przechowywać liste użytkowników klasy User
// klasa bank.Users powinna zawierać gettery
// klasa bank.Users powinna zawierać konstruktor
package bank;

public class Users {
User[] users;
int numberOfUsers = 0;

    public void addUser(User user) {
        this.users[numberOfUsers] = user;
        numberOfUsers++;
    }

    private User[] getUsers() {
        return users;
    }

    private User findUserRachunek(String numerRachunku) {
        for (int i = 0; i < numberOfUsers; i++) {
            if (users[i].getNumerRachunku().equals(numerRachunku)) {
                return users[i];
            }
        }
        return null;
    }

    private User findUserLogin(String login) {
        for (int i = 0; i < numberOfUsers; i++) {
            if (users[i].getLogin().equals(login)) {
                return users[i];
            }
        }
        return null;
    }
}
