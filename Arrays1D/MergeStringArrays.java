import java.util.Scanner;
import java.util.Arrays;

public class MergeStringArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        sc.nextLine();

        String[] arr1 = new String[n1];
        System.out.println("Enter first array strings:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextLine();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        sc.nextLine();

        String[] arr2 = new String[n2];
        System.out.println("Enter second array strings:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextLine();
        }

        String[] merged = new String[n1 + n2];

        for (int i = 0; i < n1; i++) {
            merged[i] = arr1[i];
        }

        for (int i = 0; i < n2; i++) {
            merged[n1 + i] = arr2[i];
        }

        System.out.println("Merged array: " + Arrays.toString(merged));
        sc.close();
    }
}
