public class AlternateCharacter {
    public static void main(String[] args) {
        String input = "knowyourself";

        System.out.println("Alternate characters:");

        for (int i = 0; i < input.length(); i += 2) {
            System.out.print(input.charAt(i));
        }
    }
}
