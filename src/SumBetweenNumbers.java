import java.util.Scanner;


public class SumBetweenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two values from user
        System.out.print("Enter the first number: ");
        int start = sc.nextInt();

        System.out.print("Enter the second number: ");
        int end = sc.nextInt();

        int sum = 0;

        // Ensure start is less than or equal to end
        if (start > end) {
            // Swap values if entered in reverse
            int temp = start;
            start = end;
            end = temp;
        }

        // Loop from start to end and calculate sum
        for (int i = start; i <= end; i++) {
            sum += i;
        }

        // Output result
        System.out.println("Sum of numbers from " + start + " to " + end + " is: " + sum);

        sc.close();
    }
}
