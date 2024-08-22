//WAP to find sum and average of numbers from 1 to 10.

public class sum_and_average_numbers_if_else {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        double average = sum / 10.0;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
