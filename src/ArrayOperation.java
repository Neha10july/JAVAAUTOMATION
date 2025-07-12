public class ArrayOperation {
    public static void main(String[] args) {
        //Traversing
         int[] marks ={1,2,3,4,5,6};
         int sum=0;
        for (int i = 0; i <marks.length ; i++) {
           // System.out.println(marks[i]);
            sum = sum+marks[i];
        }
        System.out.println("Sum: " + sum);
    }
}
