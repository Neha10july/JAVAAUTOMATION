public class CountEvenOdd {
    public static void main(String[] args) {
        int[] marks = {10, 25, 30, 41, 50, 63, 72};

        int even = 0;
        int odd = 0;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even count: " + even);
        System.out.println("Odd count: " + odd);
    }
}