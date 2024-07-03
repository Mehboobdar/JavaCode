import java.util.Scanner;

public class lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char health, location, gender;
        int age;

        System.out.print("Enter Health (e for Excellent and p for Poor): ");
        health = scanner.next().charAt(0);

        System.out.print("Enter Location (c for City and v for Village): ");
        location = scanner.next().charAt(0);

        System.out.print("Enter Gender (m for Male and f for Female): ");
        gender = scanner.next().charAt(0);

        System.out.print("Enter Age: ");
        age = scanner.nextInt();

        if ((health == 'e') && (location == 'c') && (gender == 'm') && (age >= 25 && age <= 35)) {
            System.out.println("\nThe Premium Is Rs.4 Per Thousand And His Policy Cannot Exceed Rs.2 Lakhs");
        } else if ((health == 'e') && (location == 'c') && (gender == 'f') && (age >= 25 && age <= 35)) {
            System.out.println("\nThe Premium Is Rs.3 Per Thousand And Her Policy Cannot Exceed Rs.1 Lakhs");
        } else if ((health == 'p') && (location == 'v') && (gender == 'm') && (age >= 25 && age <= 35)) {
            System.out.println("\nThe Premium Is Rs.6 Per Thousand And Cannot Exceed Rs. 10,000");
        } else {
            System.out.println("\nNot Insured");
        }

        scanner.close();
    }
}
