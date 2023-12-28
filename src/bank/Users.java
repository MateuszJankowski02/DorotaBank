package bank;

interface UsersInterface {

    void addUser(User user);

}

public class Users implements UsersInterface{
private User[] users;
int numberOfUsers = 0;

    /**
     * Dodaje użytkownika do listy użytkowników.
     * @param user Użytkownik.
     */

    @Override
    public void addUser(User user) {
        this.users[numberOfUsers] = user;
        numberOfUsers++;
    }

    /**
     * Zwraca listę użytkowników.
     * @return Lista użytkowników.
     */

    protected User[] getUsers() {
        return users;
    }

    /**
     * Zwraca użytkownika o podanym loginie.
     * @param login Login użytkownika.
     * @return Użytkownik o podanym loginie.
     */

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
