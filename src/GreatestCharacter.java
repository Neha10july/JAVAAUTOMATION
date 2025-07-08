public class GreatestCharacter {
    public static void main(String[] args) {
        String str = "python";
        char maxChar = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) > maxChar) {
                maxChar = str.charAt(i);
            }
        }

        System.out.println("Greatest character in \"" + str + "\" is: " + maxChar);
    }
}
