public class mul {
    public static void main(String[] args) {
        // Check if the correct number of arguments are passed
        if (args.length != 2) {
            System.out.println("Please provide two numbers for multiplication.");
            return;
        }

        try {
            // Parse the numbers from the arguments
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);

            // Perform the multiplication
            double result = num1 * num2;

            // Display the result
            System.out.println("The result of multiplication is: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numbers.");
        }
    }
}
