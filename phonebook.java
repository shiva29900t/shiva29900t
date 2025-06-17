import java.util.ArrayList;
import java.util.Scanner;
public class PhoneBookManager {
    public static void main(String[] args) {
        ArrayList<Student> phoneBook = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n Student Phone Book Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search by Name");
            System.out.println("4. Delete by Name");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phone = scanner.nextLine();
                    phoneBook.add(new Student(name, phone));
                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    if (phoneBook.isEmpty()) {
                        System.out.println(" No student records found.");
                    } else {
                        System.out.println(" List of Students:");
                        for (Student s : phoneBook) {
                            System.out.println("Name: " + s.name + ", Phone: " + s.phoneNumber);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();
                    boolean found = false;
                    for (Student s : phoneBook) {
                        if (s.name.equalsIgnoreCase(searchName)) {
                            System.out.println(" Found: " + s.name + " - " + s.phoneNumber);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println(" No student found with the given name.");
                    }
                    break;

                case 4:
                    System.out.print("Enter name to delete: ");
                    String deleteName = scanner.nextLine();
                    boolean removed = phoneBook.removeIf(s -> s.name.equalsIgnoreCase(deleteName));
                    if (removed) {
                        System.out.println(" Student deleted successfully.");
                    } else {
                        System.out.println(" Student not found.");
                    }
                    break;

                case 5:
                    System.out.println(" Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println(" Invalid choice. Please try again.");
            }

        } while (choice != 5);

        scanner.close();
    }
}
class Student {
    String name;
    String phoneNumber;

    Student(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}