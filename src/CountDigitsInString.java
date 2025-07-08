import java.util.Scanner;
public class CountDigitsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int digitCount = 0;

        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }

        System.out.println("Number of digits: " + digitCount);

        sc.close();
    }
}
