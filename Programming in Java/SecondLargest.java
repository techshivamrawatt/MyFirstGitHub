import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = input.nextInt();

        int[] arr = new int[size];
        System.out.printf("Input %d element in an array: ", size);
        for (int i=0; i<size; i++) {
            arr[i] = input.nextInt();
        }

        // Check Second largest number in an array
        int first = 0;
        int second = 0;
        for (int i=0; i<size; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }

        System.out.printf("Second Largest Number in an array: %d", second);
        input.close();

    }
    
}
