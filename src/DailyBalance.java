public class DailyBalance {
    public static void main(String[] args) {
        int balance = 0;
        int previousBalance = 0;

        for (int day = 1; day <= 10; day++) {
            previousBalance = balance;
            balance += 100;

            System.out.println("Day " + day + ": Balance = " + balance + ", Previous Day Balance = " + previousBalance);
        }
    }
}
