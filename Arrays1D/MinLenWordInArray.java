import java.util.Scanner;

public class MinLenWordInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        sc.nextLine();

        if (n <= 0) {
            System.out.println("Number of words must be positive.");
            sc.close();
            return;
        }

        String[] arr = new String[n];
        System.out.println("Enter words:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        int minIndex = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i].length() < arr[minIndex].length()) {
                minIndex = i;
            }
        }

        System.out.println("Shortest word: " + arr[minIndex]);
        System.out.println("Index: " + minIndex);
        sc.close();
    }
}
