import java.util.Scanner;

public class M {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        // Get the loan amount (principal) from the user
        System.out.println("Enter your loan amount:");
        double amount = scanner.nextDouble();

        // Get the annual interest rate from the user
        System.out.println("Enter the annual interest rate (e.g., 5 for 5%):");
        double annualRate = scanner.nextDouble();

        // Get the loan term in years from the user
        System.out.println("Enter the term (number of years):");
        int years = scanner.nextInt();

        // Calculate the monthly interest rate
        double monthlyRate = annualRate / 100 / 12;

        // Calculate the number of payments (months)
        int numberOfPayments = years * 12;

        // Calculate the monthly mortgage payment using the formula
        double monthlyPayment = (amount * monthlyRate * Math.pow(1 + monthlyRate, numberOfPayments)) /
                                (Math.pow(1 + monthlyRate, numberOfPayments) - 1);

        // Display the monthly payment
        System.out.printf("The monthly mortgage payment is: $%.2f%n", monthlyPayment);

        // Close the scanner
        scanner.close();
    }
}
