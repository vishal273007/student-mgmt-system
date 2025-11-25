package app;

import model.Student;
import service.StudentService;

import java.util.List;
import java.util.Scanner;

public class StudentManagementApp {

    private static StudentService service = new StudentService();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== Student Management System ===");
        boolean exit = false;

        while (!exit) {
            printMenu();
            int choice = readInt("Enter choice: ");

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> viewAll();
                case 3 -> searchById();
                case 4 -> searchByName();
                case 5 -> updateStudent();
                case 6 -> deleteStudent();
                case 7 -> exit = true;
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n1. Add Student");
        System.out.println("2. View All Students");
        System.out.println("3. Search Student by ID");
        System.out.println("4. Search Students by Name");
        System.out.println("5. Update Student");
        System.out.println("6. Delete Student");
        System.out.println("7. Exit");
    }

    private static void addStudent() {
        System.out.println("\n-- Add Student --");
        int id = readInt("ID: ");
        String name = readString("Name: ");
        int age = readInt("Age: ");
        String course = readString("Course: ");
        double marks = readDouble("Marks: ");

        boolean added = service.addStudent(new Student(id, name, age, course, marks));
        System.out.println(added ? "Student added." : "ID already exists.");
    }

    private static void viewAll() {
        System.out.println("\n-- All Students --");
        List<Student> list = service.getAllStudents();
        if (list.isEmpty()) System.out.println("No students.");
        else list.forEach(System.out::println);
    }

    private static void searchById() {
        int id = readInt("Enter ID: ");
        Student s = service.findById(id);
        System.out.println(s == null ? "Not found." : s);
    }

    private static void searchByName() {
        String name = readString("Enter name: ");
        List<Student> list = service.findByName(name);
        if (list.isEmpty()) System.out.println("No matches.");
        else list.forEach(System.out::println);
    }

    private static void updateStudent() {
        int id = readInt("Enter ID: ");
        Student s = service.findById(id);

        if (s == null) {
            System.out.println("Not found.");
            return;
        }

        String newName = readStringAllowEmpty("New name: ");
        Integer newAge = readIntAllowEmpty("New age: ");
        String newCourse = readStringAllowEmpty("New course: ");
        Double newMarks = readDoubleAllowEmpty("New marks: ");

        boolean updated = service.updateStudent(
                id,
                newName.isEmpty() ? null : newName,
                newAge,
                newCourse.isEmpty() ? null : newCourse,
                newMarks
        );

        System.out.println(updated ? "Updated." : "Failed.");
    }

    private static void deleteStudent() {
        int id = readInt("Enter ID: ");
        System.out.println(service.deleteStudent(id) ? "Deleted." : "Not found.");
    }

    // -------- Input Helpers --------

    private static int readInt(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid number.");
            }
        }
    }

    private static Integer readIntAllowEmpty(String msg) {
        while (true) {
            System.out.print(msg);
            String s = scanner.nextLine();

            if (s.isEmpty()) return null;

            try {
                return Integer.parseInt(s);
            } catch (Exception e) {
                System.out.println("Invalid.");
            }
        }
    }

    private static double readDouble(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return Double.parseDouble(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid number.");
            }
        }
    }

    private static Double readDoubleAllowEmpty(String msg) {
        while (true) {
            System.out.print(msg);
            String s = scanner.nextLine();

            if (s.isEmpty()) return null;

            try {
                return Double.parseDouble(s);
            } catch (Exception e) {
                System.out.println("Invalid.");
            }
        }
    }

    private static String readString(String msg) {
        System.out.print(msg);
        return scanner.nextLine();
    }

    private static String readStringAllowEmpty(String msg) {
        System.out.print(msg);
        return scanner.nextLine();
    }
}
