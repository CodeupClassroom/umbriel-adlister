package com.codeup.adlister;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordsLecture {
    public static void main(String[] args) {
        String password = "password123";
        String hash = BCrypt.hashpw(password, BCrypt.gensalt());
        System.out.println(hash);
// Output: $2a$10$TbjLzPRB1MBIQAQbFsmANOumLP0oOEU1b.MvZFkeqIG0D8RqzFbIq
        boolean passwordMatch = BCrypt.checkpw(password, hash);
        System.out.println(passwordMatch);
        passwordMatch = BCrypt.checkpw("password123", hash);
        System.out.println(passwordMatch);
        passwordMatch = BCrypt.checkpw("C0z45pd12!!@!7", hash);
        System.out.println(passwordMatch);

    }
}
