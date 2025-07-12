package ArrayInJava;

public class TwoDimensialArray {
    public static void main(String[] args) {
        int test_arr1[][] = new int[5][5];
        //int test_arr1[][] = {{2,4,6}, {8,10,12}, {14,16,18}};
        int temp = 2;
        int len = test_arr1.length;
        System.out.println("Length of array :" +len);
        for (int i = 0; i <len ; i++) {
            int len1 = test_arr1.length;
            for (int j = 0; j < len1 ; j++) {
                test_arr1[i][j]= temp;
                System.out.print(test_arr1[i][j]+ " ");
                temp=temp+2;
            }
            System.out.println(" ");
        }
    }
}
