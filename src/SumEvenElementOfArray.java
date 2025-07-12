public class SumEvenElementOfArray {
    public static void main(String[] args) {
        int []  marks = {1,2,3,4,5,6};
        int sum = 0;
        for (int i = 0; i <marks.length ; i++) {
            if(marks[i]%2==0){
                System.out.println("Even elements " + marks[i]);
                sum = sum+marks[i];
            }
        }
        System.out.println("Sum of even element " + sum);
    }
}
