//WAP to find whether the inputted number is even or odd.


import java.util.Scanner;

public class inputted_number_even_or_add {

    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return number + " is even ";
        } else {
            return number + " is odd ";
        }
    }
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter a number :- ");
        int number = scanner.nextInt();

        String result = checkEvenOrOdd(number);
        System.out.println(result);

        scanner.close();
    }
}