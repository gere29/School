import java.util.Scanner;

public class OOP {
    public static void main(String[] args) {
        GradeCalculator calculator = new GradeCalculator();

        calculator.inputGrades();
        double average = calculator.computeAverage();

        System.out.println("\nGrade Average: " + average);
    }
}

class GradeCalculator {
    private double[] grades = new double[5];

    public void inputGrades() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 grades:\n");

        for (int i = 0; i < 5; i++) {

            while (true) {
                System.out.print("Grade " + (i + 1) + ": ");

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

        scanner.close();
    }

    public double computeAverage() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }
}
