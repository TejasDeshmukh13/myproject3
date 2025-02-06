import java.util.Scanner;

public class Mul {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        // Ask the user for the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        // Perform the multiplication
        double result = num1 * num2;
        
        // Display the result
        System.out.println("The result of multiplication is: " + result);
        
        // Close the scanner
        scanner.close();
    }
}
