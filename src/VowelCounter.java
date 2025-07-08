public class VowelCounter {
    public static void main(String[] args) {
        String input = "python programming";
        int vowelCount = 0;

        for (char ch : input.toCharArray()) {
            char lower = Character.toLowerCase(ch);

            if (lower == 'a' || lower == 'e' || lower == 'i' ||
                    lower == 'o' || lower == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
    }
}
