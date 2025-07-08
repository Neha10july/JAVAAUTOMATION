public class GreatestCharacter1 {
    public static void main(String[] args) {
        String input = "01275923";
        char maxChar = '0';

        for (char ch : input.toCharArray()) {
            if (ch > maxChar) {
                maxChar = ch;
            }
        }

        System.out.println("Greatest character: " + maxChar);
    }
}
