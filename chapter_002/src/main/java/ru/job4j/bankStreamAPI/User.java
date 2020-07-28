package ru.job4j.bankStreamAPI;

import java.util.Objects;
import java.util.Random;

public class User {
    private String passport;
    private String username;

    public String getId() {
        return this.id;
    }

    private String id;
    public User() {
    }
    public User(String passport, String username) {
        genId();
        this.passport = passport;
        this.username = username;

    }
     private void genId() {
         Random random = new Random();
        this.id = username + random.nextInt();
     }
    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
