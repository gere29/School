import java.util.Scanner;

public class OOP {
    public static void main(String[] args) {
        GradeCalculator calculator = new GradeCalculator();

        calculator.GradeInput();
        double average = calculator.computeAverage();

        System.out.println("Average: " + average);
    }
}


class GradeCalculator {
    private double[] grades = new double[5];

    public void GradeInput() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 grades:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Grade " + (i + 1) + ": ");
            grades[i] = sc.nextDouble();
        }

        sc.close();
    }

    public double computeAverage() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }
}
