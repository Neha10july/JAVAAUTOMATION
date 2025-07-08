import java.util.HashSet;
public class FirstRepeatedChar {

    public static void main(String[] args) {
        String input = "neha shah";
        HashSet<Character> seen = new HashSet<>();

        for (char ch : input.toCharArray()) {
            if (seen.contains(ch)) {
                System.out.println("First repeated character: " + ch);
                return;
            } else {
                seen.add(ch);
            }
        }

        System.out.println("No repeated characters found.");
    }
}
