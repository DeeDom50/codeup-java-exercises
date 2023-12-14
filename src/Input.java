import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    // Get an integer from the user
    public static int getInt(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a valid integer: ");
            scanner.next(); // consume the invalid input
        }
        int userInput = scanner.nextInt();
        scanner.nextLine(); // consume the newline character
        return userInput;
    }

    // Get a string from the user
    public static String getString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    // Close the scanner
    public static void close() {
        scanner.close();
    }
}


