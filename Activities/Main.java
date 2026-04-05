import java.util.ArrayList;

// Interface for Abstraction
interface Attendance {
    void checkIn();
    void checkOut();
}

// Abstract Parent Class
abstract class Person {
    protected String fullName;
    protected int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public abstract void displayRole();
}

// Child Class: Student
class Student extends Person implements Attendance {

    // Encapsulation: Private fields
    private String studentNumber;
    private String course;

    public Student(String studentNumber, String fullName, String course, int age) {
        super(fullName, age);
        this.studentNumber = studentNumber;
        this.course = course;
    }

    // Getters and Setters
    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public void displayRole() {
        System.out.println(fullName + " is a Student.");
    }

    @Override
    public void checkIn() {
        System.out.println(fullName + " checked in.");
    }

    @Override
    public void checkOut() {
        System.out.println(fullName + " checked out.");
    }

    public void displayInfo() {
        System.out.println("Student Number: " + studentNumber);
        System.out.println("Name: " + fullName);
        System.out.println("Course: " + course);
        System.out.println("Age: " + age);
        System.out.println("----------------------");
    }
}

// Child Class: Teacher
class Teacher extends Person {

    public Teacher(String fullName, int age) {
        super(fullName, age);
    }

    @Override
    public void displayRole() {
        System.out.println(fullName + " is a Teacher.");
    }
}

public class Main {

    public static void main(String[] args) {

        // Part 2: ArrayList Collection
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("2024-001", "Juan Dela Cruz", "BSIT", 20));
        students.add(new Student("2024-002", "Maria Santos", "BSCS", 21));
        students.add(new Student("2024-003", "Gere Cagandahan", "BSIS", 19));
        students.add(new Student("2024-004", "Ana Lopez", "BSIT", 22));
        students.add(new Student("2024-005", "Carlos Mendoza", "BSCS", 20));

        // Display Students
        System.out.println("STUDENT LIST\n");

        for (Student s : students) {
            s.displayInfo();
            s.displayRole();
            s.checkIn();
            s.checkOut();
            System.out.println();
        }

        // Polymorphism Example
        Person teacher = new Teacher("Mr. Smith", 40);
        teacher.displayRole();
    }
}