package ArrayInJava;

public class FirstArray {
    public static void main(String[] args) {
/*        int arr[] = new int[10];
        System.out.println(arr);

        int [] arr1 = new int[5];
        System.out.println(arr1);

        int [] arr2 = new int[5];
        System.out.println(arr2);*/
/*
        int arr3[] = {11,22,33,44,55};
        int len = arr3.length;

        for (int i = 0; i < len ; i++) {
            System.out.println(arr3[i]);

        }*/

        /*char arr[] = {'n','e','h','a'};
        int len = arr.length;
        System.out.println("Length of array :" + len);

        for (int i = 0; i < len; i++) {

            System.out.println(arr[i]);
        }*/

        int arr4[] = new int[10];
        int len = arr4.length;
        System.out.println("Length of Array :" + len);
        int temp = 3;
        for (int i = 0; i <len; i++) {
            System.out.println(arr4[i] = temp);
            temp = temp + 3;
        }
    }
}
