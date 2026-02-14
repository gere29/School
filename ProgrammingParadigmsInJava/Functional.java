import java.util.Scanner;
import java.util.Arrays;

public class Functional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] grades = new double[5];

        System.out.println("Enter 5 grades:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Grade " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
        }

        double average = Arrays.stream(grades)
                               .average()
                               .orElse(0);

        System.out.println("Average: " + average);

        scanner.close();
    }
}
