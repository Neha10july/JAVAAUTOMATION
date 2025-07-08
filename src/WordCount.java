import java.util.Scanner;
public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().trim();
        String[] words = sentence.split("\\s+");

        System.out.println("Number of words: " + words.length);

        sc.close();
    }
}
