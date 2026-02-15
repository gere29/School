import java.util.Scanner;
import java.util.Arrays;

public class Functional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] grades = new double[5];

        System.out.println("Enter 5 grades:\n");

        for (int i = 0; i < 5; i++) {

            while (true) {
                System.out.print("Grade number " + (i + 1) + ": ");

                if (scanner.hasNextDouble()) {
                    double input = scanner.nextDouble();

                    if (input >= 1 && input <= 100) {
                        grades[i] = input;
                        break;
                    } else {
                        System.out.println("Invalid grade.");
                    }

                } else {
                    System.out.println("Invalid input.");
                    scanner.next();
                }
            }
        }

        double average = Arrays.stream(grades).average().orElse(0);

        System.out.println("\nGrade Average: " + average);

        scanner.close();
    }
}
