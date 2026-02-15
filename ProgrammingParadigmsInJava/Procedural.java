import java.util.Scanner;

public class Procedural {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;

        System.out.println("Enter 5 grades:\n");

        for (int i = 1; i <= 5; i++) {

            while (true) {
                System.out.print("Grade number " + i + ": ");

                if (scanner.hasNextDouble()) {
                    double grade = scanner.nextDouble();

                    if (grade >= 1 && grade <= 100) {
                        sum += grade;
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

        double average = sum / 5;
        System.out.println("\nGrade Average: " + average);

        scanner.close();
    }
}
