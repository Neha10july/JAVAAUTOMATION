import java.util.Scanner;

public class SquareFilled {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number=: ");
        int size = input.nextInt();
        for (int i = 1; i <= size; i++) {
            for (int j = i; j <=size; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
