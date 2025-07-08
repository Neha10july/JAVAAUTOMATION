public class MultiplesOf12 {
    public static void main(String[] args) {
        System.out.println("Multiples of 12 from 1 to 100:");

        for (int i = 1; i <= 100; i++) {
            if (i % 12 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
