import java.util.Scanner;
public class CommonCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine().toLowerCase();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine().toLowerCase();

        String common = "";

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);

            if (str2.indexOf(ch) != -1 && common.indexOf(ch) == -1) {
                common += ch;
            }
        }

        if (common.length() > 0) {
            System.out.println("Common characters: " + common);
        } else {
            System.out.println("No common characters found.");
        }

    }
}
