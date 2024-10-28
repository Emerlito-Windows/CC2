import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Scanner object to read user input
        String password;  // Variable to store the user's password input
        boolean isValid = false;  // Flag to indicate if the password is valid

        // Loop until a valid password is entered
        while (!isValid) {
            System.out.print("Enter your password: ");
            password = scanner.nextLine();  // Read the user's password input
            
            // Check if the password is valid
            if (isValidPassword(password)) {
                System.out.println("Your password is valid!");
                isValid = true;  // Exit loop if password is valid
            } else {
                // Display message if password does not meet the criteria
                System.out.println("Password must contain at least 8 characters, including one uppercase letter and one number.");
            }
        }
        scanner.close();  // Close the scanner
    }

    /**
     * Checks if the given password meets the following criteria:
     * - At least 8 characters long
     * - Contains at least one uppercase letter
     * - Contains at least one numeric digit
     */
    public static boolean isValidPassword(String password) {
        // Check if the password length is at least 8 characters
        if (password.length() < 8) {
            return false;
        }

        // Initialize flags to check for uppercase and numeric characters
        boolean hasUppercase = false;
        boolean hasNumber = false;

        // Loop through each character in the password
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {  // Check if the character is uppercase
                hasUppercase = true;
            }
            if (Character.isDigit(c)) {  // Check if the character is a digit
                hasNumber = true;
            }
            // If both conditions are met, return true
            if (hasUppercase && hasNumber) {
                return true;
            }
        }

        // Return false if either condition is not met
        return false;
    }
}