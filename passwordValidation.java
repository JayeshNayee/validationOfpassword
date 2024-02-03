import java.util.Scanner;

public class passwordValidation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your password: ");
        String password = scanner.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid.");
        }

      //  scanner.close();
    }

    private static boolean isValidPassword(String password) {
        // Check if password has at least 8 characters
        if (password.length() < 8) {
            return false;
        }

        // Check if password contains at least one uppercase letter
        boolean hasUppercase = false;
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
                break;
            }
        }

        // Check if password contains at least one lowercase letter
        boolean hasLowercase = false;
        for (char ch : password.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                hasLowercase = true;
                break;
            }
        }

        // Check if password contains at least one digit
        boolean hasDigit = false;
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                hasDigit = true;
                break;
            }
        }

        // Check if password contains at least one special character
        boolean hasSpecialChar = false;
        String specialChars = "!@#$%^&*()-_=+[{]};:'\",<.>/?";
        for (char ch : password.toCharArray()) {
            if (specialChars.contains(String.valueOf(ch))) {
                hasSpecialChar = true;
                break;
            }
        }

        // Return true if all criteria are met
        return hasUppercase && hasLowercase && hasDigit && hasSpecialChar;
    }
}
