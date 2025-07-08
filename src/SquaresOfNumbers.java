public class SquaresOfNumbers {
    public static void main(String[] args) {
        System.out.println("Number\tSquare");

        for (int i = 1; i <= 10; i++) {
            int square = i * i;
            System.out.println(i + "\t" + square);
        }
    }
}
