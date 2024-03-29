import java.util.Scanner;

public class LoginDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Set a predefined username and password
        String correctUsername = "user@24";
        String correctPassword = "pass2024";

        // Number of allowed attempts remaining
        int attempts = 3;

        // Main loop for login attempts
        while (attempts > 0) {
            // Get username and password from the user
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            // Check for correct credentials
            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login successful! Welcome, " + username);
                break; // Exit the loop if login is successful
            } else {
                attempts--;
                System.out.println("Incorrect username or password. Attempts left: " + attempts);
            }
        }

        // If all attempts are used up
        if (attempts == 0) {
            System.out.println("You've exceeded the maximum number of attempts. Account locked.");
        }

        scanner.close();
    }
}
