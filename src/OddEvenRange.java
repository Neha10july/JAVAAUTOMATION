import java.util.Scanner;
public class OddEvenRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start number: ");
        int start = sc.nextInt();

        System.out.print("Enter end number: ");
        int end = sc.nextInt();

        // Loop through the range and print labels
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println(i + ":Even");
            } else {
                System.out.println(i + ":Odd");
            }
        }
    }
}
