public class CountDigitsGreaterThanFive {
    public static void main(String[] args) {
        String input = "1234567890";
        int count = 0;

        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                int digit = Character.getNumericValue(ch);
                if (digit > 5) {
                    count++;
                }
            }
        }

        System.out.println("Number of digits greater than 5: " + count);
    }
}
