import java.util.Scanner;

class Student_Detail {
    String name;
    int id;
    String college_name;

    public Student_Detail(String name, int id, String college_name) {
        this.name = name;
        this.id = id;
        this.college_name = college_name;
    }

    public void display_details() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("College Name: " + college_name);
    }
}

public class StudentRecordApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents;

        System.out.print("Enter the number of students: ");
        numberOfStudents = scanner.nextInt();

        Student_Detail[] students = new Student_Detail[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            scanner.nextLine();  // Consume the newline character left by nextInt()
            System.out.println("Enter details for Student " + (i + 1));
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character left by nextInt()
            System.out.print("College Name: ");
            String collegeName = scanner.nextLine();

            students[i] = new Student_Detail(name, id, collegeName);
        }

        System.out.println("\nStudent Details:");
        for (Student_Detail student : students) {
            student.display_details();
            System.out.println();
        }
    }
}
