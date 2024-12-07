package org.example.temp_cohesion.solution;

public class UserManager {
    private final UserCreator userCreator = new UserCreator();
    private final EmailSender emailSender = new EmailSender();

    public void handleUserAccount(String username, String email) {
        userCreator.createUser(username);
        emailSender.sendWelcomeEmail(email);
    }
}
