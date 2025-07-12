public class FindOddElement {
    public static void main(String[] args) {
        int []  marks = {1,2,3,4,5,6};
        for (int i = 0; i <marks.length ; i++) {
            if(marks[i]%2==1){
                System.out.println("Odd elements " + marks[i]);
            }

        }
    }
}
