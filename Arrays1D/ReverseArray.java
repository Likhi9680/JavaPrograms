import java.util.Scanner;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        String[] reversed = new String[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = arr[n - 1 - i];
        }

        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Reversed array: " + Arrays.toString(reversed));
        sc.close();
    }
}
