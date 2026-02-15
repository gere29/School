import java.util.Scanner;

public class OOP {
    public static void main(String[] args) {
        GradeCalc calculator = new GradeCalc();

        calculator.inputGrades();
        double average = calculator.computeAvg();

        System.out.println("\nGrade Average: " + average);
    }
}




class GradeCalc {
    private double[] grades = new double[5];

    public void inputGrades() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 grades:\n");

        for (int i = 0; i < 5; i++) {
            while (true) {
                System.out.print("Grade number " + (i + 1) + ": ");
                double input = scanner.nextDouble();

                if (input >= 1 && input <= 100) {
                    grades[i] = input;
                    break;
                } else {
                    System.out.println("Invalid grade.");
                }
            }
        }

        scanner.close();
    }

    public double computeAvg() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }
}
