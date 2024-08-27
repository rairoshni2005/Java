//WAP to find the greatest among three numbers using the conditional operator

import java.util.Scanner;

public class greatest_among_three_numbers_conditional_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        System.out.println("Enter third number:");
        int c = sc.nextInt();
        sc.close();

        int greatest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("The greatest number is: " + greatest);
    }
}
