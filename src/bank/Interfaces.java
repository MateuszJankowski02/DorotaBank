package bank;

/**
 * Interface representing a collection of users.
 */
interface UsersInterface {

    /**
     * Adds a user to the collection.
     *
     * @param user The user to be added.
     */
    void addUser(User user);

    /**
     * Retrieves an array of users.
     *
     * @return An array of users.
     */

     User[] getUsers();

    /**
     * Finds a user based on the account number.
     *
     * @param numerRachunku The account number to search for.
     * @return The user with the specified account number, or null if not found.
     */
    User findUserRachunek(String numerRachunku);

    /**
     * Finds a user based on the login.
     *
     * @param login The login to search for.
     * @return The user with the specified login, or null if not found.
     */
    User findUserLogin(String login);
}

interface PrzelewInterface {

    String toString();

    /**
     * Retrieves the type of the transfer.
     *
     * @return The type of the transfer.
     */
    String getRodzajPrzelewu();

    /**
     * Retrieves the recipient's account.
     *
     * @return The recipient's account.
     */
    String getKontoOdbiorcy();
}