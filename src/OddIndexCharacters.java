public class OddIndexCharacters {
    public static void main(String[] args) {
        String input = "HelloWorld";

        System.out.print("Characters at odd indices: ");

        for (int i = 1; i < input.length(); i += 2) {
            System.out.print(input.charAt(i));
        }
    }
}
