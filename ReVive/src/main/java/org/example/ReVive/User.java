package org.example.ReVive;

import java.util.Objects;

public class User {

    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * Método equals normal y corriente, pero le he añadido un 'id',
     * en caso de ser 1 verifica la similitud en username y password,
     * pero en caso de ser 0 solo verifica la similitud del username
     * @param o
     * @param id
     * @return
     */
    public boolean equals(User o, int id) {

        if (id == 1) {
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return Objects.equals(username, user.username) && Objects.equals(password, user.password);
        } else {
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return Objects.equals(username, user.username);
        }


    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }
}