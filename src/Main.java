import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("LabW2D1\n");

        Scanner scanner = new Scanner(System.in);

        //Task1
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age < 6 || age > 120) {
            System.out.println("ERROR: Invalid age !!");
        } else if (age <= 12) {
            System.out.println("you are in primary school");
        } else if (age <= 18) {
            System.out.println("you are in secondary school");
        } else if (age <= 25) {
            System.out.println("you are in university school");
        } else {
            System.out.println("you are working");
        }

        System.out.println();

        //Task2
        for (int i = 20; i >= 10; i--) {
            int square = i * i;
            System.out.println("Number: " + i + ", Square: " + square);
        }
        System.out.println();

        //Task3
        System.out.println("Enter your mother's name: ");
        String motherName = scanner.nextLine();

        System.out.print("Enter your mother's age: ");
        int motherAge = scanner.nextInt();
        scanner.nextLine();

        System.out.println();

        System.out.println("Enter your father's name: ");
        String fatherName = scanner.nextLine();

        System.out.print("Enter your father's age: ");
        int fatherAge = scanner.nextInt();
        scanner.nextLine();

        double averageAge = (motherAge + fatherAge) / 2.0;

        System.out.println("your mother is called " + motherName + " and is " + motherAge + " years old, " + "and your father is called " + fatherName + " and is " + fatherAge + " years old, " + "and the average of their ages is " + averageAge + ".");
    }
}
