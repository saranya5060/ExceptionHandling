public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle the ArithmeticException
            System.err.println("Error: Division by zero is not allowed.");
        } finally {
            // This block is executed regardless of whether an exception occurred or not
            System.out.println("Finally block executed.");
        }

        System.out.println("Program continues after handling the exception.");
    }

    // A method that can throw an exception
    public static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}
