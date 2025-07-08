public class SumOfIndices {
    public static void main(String[] args) {
        String s = "python";
        int sumIndices = 0;
        int index = 0;
        for (char c : s.toCharArray()) {
            sumIndices += index;
            index++;
        }
        System.out.println("Sum of indices: " + sumIndices);
    }
}
