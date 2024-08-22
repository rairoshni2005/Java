//WAP to demonstrate implicit type conversion and explicit type conversion.

public class type_conversion_demo {
    public static void main(String[] args) {
        // Implicit Type Conversion (Widening)
        int num1 = 100;
        double num2 = num1;  // int to double conversion
        System.out.println("Implicit Type Conversion:");
        System.out.println("Value of num1 (int): " + num1);
        System.out.println("Value of num2 (double): " + num2);

        // Explicit Type Conversion (Narrowing)
        double num3 = 100.55;
        int num4 = (int) num3;  // double to int conversion
        System.out.println("\nExplicit Type Conversion:");
        System.out.println("Value of num3 (double): " + num3);
        System.out.println("Value of num4 (int): " + num4);
    }
}