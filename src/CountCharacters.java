import java.util.Scanner;
public class CountCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from user
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Count total characters including spaces
        int count = str.length();

        System.out.println("Total number of characters: " + count);
    }
}
