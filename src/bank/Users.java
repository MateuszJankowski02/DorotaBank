// zdefiniuj klasę Users, która będzie przechowywać liste użytkowników klasy User
// klasa bank.Users powinna zawierać gettery
// klasa bank.Users powinna zawierać konstruktor
package bank;

public class Users {
private User[] users;
int numberOfUsers = 0;

    public void addUser(User user) {
        this.users[numberOfUsers] = user;
        numberOfUsers++;
    }

    protected User[] getUsers() {
        return users;
    }

    protected User findUserLogin(String login) {
        for (int i = 0; i < numberOfUsers; i++) {
            if (users[i].getLogin().equals(login)) {
                return users[i];
            }
        }
        System.out.println("Nie znaleziono użytkownika o loginie: " + login);
        return null;
    }
}
