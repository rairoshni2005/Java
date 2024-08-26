public class exception_handling {
    public static void main(String[] args) {
        int d;

        try {
            d = 0;
            int a = 42 / d; 
            System.out.println("This will not be printed." + a); 
        } catch (ArithmeticException e) {
            // Handling the exception
            System.out.println("Exception caught: " + e);
            System.out.println("Division by zero.");
        }

        System.out.println("After catch statement");
    }
}
