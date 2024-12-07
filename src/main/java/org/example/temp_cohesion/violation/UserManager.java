package org.example.temp_cohesion.violation;

public class UserManager {
    public void handleUserAccount(String username, String email) {
        //Create the user account
        System.out.println("User account created for: " + username);

        //Send a welcome email
        System.out.println("Welcome email sent to: " + email);

    }
}
