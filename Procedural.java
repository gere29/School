import java.util.Scanner;

public class Procedural {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;

        System.out.println("Enter 5 grades:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Grade " + i + ": ");
            double grade = scanner.nextDouble();
            sum += grade;
        }

        double average = sum / 5;

        System.out.println("Average: " + average);

        scanner.close();
    }
}
