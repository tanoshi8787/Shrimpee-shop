package com.mycompany.user;

public class AccountNotFoundException extends Throwable {
    public AccountNotFoundException(String message) {
        super(message);
    }
}
