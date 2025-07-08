import java.util.Scanner;

public class AlternateCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from user
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        System.out.print("Alternate characters: ");
        for (int i = 0; i < str.length(); i += 2) {
            System.out.print(str.charAt(i));
        }
    }
}
