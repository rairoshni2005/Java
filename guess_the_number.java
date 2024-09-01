//Write a program that generates a random number between 1 to 100 and asks the user to guesswhat the number is. If the user's guess is higher than the random number, the program shoulddisplay "Too high, try again." If the user's guess is lower than the random number, the programshould display "Too low, try again." The program should use a loop that repeats until the usercorrectly guesses the random number (Hint: use Math.random() for generating random number.Eg. number = (int) (Math.random() * 100) + 1;).

import java.util.Scanner;

public class guess_the_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Generate a random number between 1 and 100
        int number = (int) (Math.random() * 100) + 1;
        int guess = 0;

        System.out.println("Guess the number between 1 and 100!");

        // Loop until the user guesses the correct number
        while (guess != number) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess > number) {
                System.out.println("Too high, try again.");
            } else if (guess < number) {
                System.out.println("Too low, try again.");
            } else {
                System.out.println("Congratulations! You've guessed the correct number: " + number);
            }
        }

        scanner.close();
    }
}
