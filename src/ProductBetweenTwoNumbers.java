import java.util.Scanner;
public class ProductBetweenTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers from user
        System.out.print("Enter the first number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int end = scanner.nextInt();

        long product = 1;

        // Ensure start is smaller than end
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        // Calculate product
        for (int i = start; i <= end; i++) {
            product *= i;
        }

        System.out.println("The product of numbers between " + start + " and " + end + " is: " + product);
    }
}
