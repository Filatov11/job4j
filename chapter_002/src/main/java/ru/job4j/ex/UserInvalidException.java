package ru.job4j.ex;

public class UserInvalidException extends  UserNotFoundException {
    public UserInvalidException(String message) {
        super("User Invalid Exception " + message);
    }
}
