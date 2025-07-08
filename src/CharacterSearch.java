import java.util.Scanner;
public class CharacterSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.print("Enter a character to search: ");
        char searchChar = sc.next().charAt(0);

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == searchChar) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Character '" + searchChar + "' found " + count + " time(s) in the string.");
        } else {
            System.out.println("Character '" + searchChar + "' not found in the string.");
        }

    }
}
