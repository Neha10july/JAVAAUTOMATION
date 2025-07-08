import java.util.Scanner;
public class CountAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int letterCount = 0;

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                letterCount++;
            }
        }

        System.out.println("Number of alphabets: " + letterCount);

        sc.close();
    }
}
