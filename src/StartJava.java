import java.util.Scanner;
public class StartJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User enters the size of the array
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        // Create array of user-defined size
        int[] my_arr = new int[size];

        // User inputs array elements
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element at index " + i + ": ");
            my_arr[i] = scanner.nextInt();
        }

        // Display the array
        System.out.println("You entered:");
        for (int i = 0; i < size; i++) {
            System.out.println("my_arr[" + i + "] = " + my_arr[i]);
        }

        // Optional: Access a specific index (with safety check)
        System.out.print("Enter index to access (0 to " + (size - 1) + "): ");
        int index = scanner.nextInt();

        if (index >= 0 && index < size) {
            System.out.println("Value at index " + index + ": " + my_arr[index]);
        } else {
            System.out.println("Invalid index! Please enter index from 0 to " + (size - 1));
        }
    }
}
