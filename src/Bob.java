import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, I'm Bob. How can I help you?");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine();

            if (userInput.endsWith("?")) {
                System.out.println("Bob: Sure.");
            } else if (userInput.endsWith("!")) {
                System.out.println("Bob: Whoa, chill out!");
            } else if (userInput.trim().isEmpty()) {
                System.out.println("Bob: Fine. Be that way!");
            } else {
                System.out.println("Bob: Whatever.");
            }

            System.out.print("Do you want to continue talking to Bob? (yes/no): ");
            String continueTalking = scanner.nextLine().toLowerCase();

            if (!continueTalking.equals("yes")) {
                System.out.println("Goodbye!");
                break;
            }
        }

        // Close the scanner
        scanner.close();
    }
}