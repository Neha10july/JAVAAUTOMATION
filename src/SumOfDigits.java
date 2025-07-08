public class SumOfDigits {
    public static void main(String[] args) {
        String input = "123";
        int sum = 0;

        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            }
        }

        System.out.println("Sum of digits: " + sum);
    }
}
