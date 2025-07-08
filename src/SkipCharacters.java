public class SkipCharacters {
    public static void main(String[] args) {
        String str = "Dreamer infotech";

        System.out.print("Output: ");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Skip 'm' and 'i'
            if (ch == 'm' || ch == 'i') {
                continue;
            }

            System.out.print(ch);
        }
    }
}
