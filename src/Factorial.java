import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number from user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        long factorial = 1;

        // Calculate factorial using for loop
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
