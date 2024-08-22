// Write a Java program where you define a class named Student with the following attributes: rollNo, name, and marks. The class should have two methods: addInfo() to input the student's details and display() to print the student's details.

import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int marks;

    void addInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        rollNo = scanner.nextInt();
        scanner.nextLine();  

        System.out.print("Enter Name: ");
        name = scanner.nextLine();

        System.out.print("Enter Marks: ");
        marks = scanner.nextInt();

        scanner.close();
    }
    void display() {
        System.out.println("Student Details:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.addInfo();
        student.display();
    }
}