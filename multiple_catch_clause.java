public class multiple_catch_clause {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int result = 10 / 2; // No division by zero
            System.out.println(result); // Print the result
            System.out.println(numbers[5]); // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e);
        } catch (Exception e) {
            System.out.println("General exception caught: " + e);
        }

        System.out.println("After catch statements.");
    }
}
