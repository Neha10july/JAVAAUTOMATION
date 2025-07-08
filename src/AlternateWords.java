public class AlternateWords {
    public static void main(String[] args) {
        String input = "if you think you can not do, you can not show think wisely";

        String[] words = input.trim().split(" ");

        System.out.println("Alternate words:");
        for (int i = 0; i < words.length; i += 2) {
            System.out.print(words[i] + " ");
        }
    }
}
