import java.util.Scanner;
public class ReplaceVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String result = input.replaceAll("(?i)[aeiou]", "*");

        System.out.println("Modified string: " + result);
    }
}
