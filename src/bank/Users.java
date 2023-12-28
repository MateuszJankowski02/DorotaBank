package bank;

import java.util.ArrayList;
import java.util.List;

interface UsersInterface {

    void addUser(User user);

}

public class Users implements UsersInterface{
private List<User> users = new ArrayList<>();
int numberOfUsers = 0;

    /**
     * Dodaje użytkownika do listy użytkowników.
     * @param user Użytkownik.
     */

    @Override
    public void addUser(User user) {
        users.add(user);
        numberOfUsers++;
    }

    /**
     * Zwraca listę użytkowników.
     * @return Lista użytkowników.
     */

    protected List<User> getUsers() {
        return users;
    }

    /**
     * Zwraca użytkownika o podanym loginie.
     * @param login Login użytkownika.
     * @return Użytkownik o podanym loginie.
     */

    protected User findUserLogin(String login) {
        for (int i = 0; i < numberOfUsers; i++) {
                if (users.get(i).getLogin().equals(login)) {
                return users.get(i);
            }
        }
        System.out.println("Nie znaleziono użytkownika o loginie: " + login);
        return null;
    }
}
