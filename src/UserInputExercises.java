import java.util.Scanner;

public class UserInputExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter an integer
        System.out.print("Enter an integer: ");
        int userInteger = scanner.nextInt();
        System.out.println("You entered: " + userInteger);

        // Clear the scanner buffer
        scanner.nextLine();

        // Prompt user to enter 3 words
        System.out.print("Enter 3 words: ");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();

        System.out.println("You entered:");
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);

        // Clear the scanner buffer
        scanner.nextLine();

        // Prompt user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.println("You entered: " + sentence);

        // Close the scanner
        scanner.close();
    }
}
