public class ControlFlowExercises {
    public static void main(String[] args) {
        // While Loop
        // Exercise 1
        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }

        // Do-While Loop
        // Exercise 2
        int countByTwos = 0;
        do {
            System.out.println(countByTwos);
            countByTwos += 2;
        } while (countByTwos <= 100);

        // Exercise 3
        int countBackwardsByFives = 100;
        do {
            System.out.println(countBackwardsByFives);
            countBackwardsByFives -= 5;
        } while (countBackwardsByFives >= -10);

        // Exercise 4
        long number = 2;
        do {
            System.out.println(number);
            number *= number;
        } while (number < 1_000_000);

        // For Loop
        // Exercise 2
        for (int j = 0; j <= 100; j += 2) {
            System.out.println(j);
        }

        // Exercise 3
        for (int k = 100; k >= -10; k -= 5) {
            System.out.println(k);
        }

        // FizzBuzz
        // Exercise 5
        for (int n = 1; n <= 100; n++) {
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (n % 3 == 0) {
                System.out.println("Fizz");
            } else if (n % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(n);
            }
        }

        // Display a table of powers
        // Exercise 6
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("What number would you like to go up to? ");
        // int userNumber = scanner.nextInt();
        // System.out.println("\nHere is your table!\n");
        // System.out.println("number | squared | cubed");
        // System.out.println("------ | ------- | -----");
        // for (int num = 1; num <= userNumber; num++) {
        //     System.out.printf("%-6d | %-7d | %-5d%n", num, num * num, num * num * num);
        // }
        // scanner.close();

        // Convert given number grades into letter grades
        // Exercise 7
        // Scanner scanner = new Scanner(System.in);
        // String choice;
        // do {
        //     System.out.print("Enter a numerical grade: ");
        //     int numericGrade = scanner.nextInt();
        //     char letterGrade;
        //     if (numericGrade >= 88 && numericGrade <= 100) {
        //         letterGrade = 'A';
        //     } else if (numericGrade >= 80 && numericGrade <= 87) {
        //         letterGrade = 'B';
        //     } else if (numericGrade >= 67 && numericGrade <= 79) {
        //         letterGrade = 'C';
        //     } else if (numericGrade >= 60 && numericGrade <= 66) {
        //         letterGrade = 'D';
        //     } else {
        //         letterGrade = 'F';
        //     }
        //     System.out.println("Letter grade: " + letterGrade);
        //     System.out.print("Do you want to continue? (yes/no): ");
        //     choice = scanner.next();
        // } while (choice.equalsIgnoreCase("yes"));
        // scanner.close();
    }
}

