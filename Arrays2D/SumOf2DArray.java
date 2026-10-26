import java.util.Scanner;

public class SumOf2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();

        int[][] arr = new int[m][n];
        int sum = 0;

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
        }

        System.out.println("Sum of all elements: " + sum);

        sc.close();
    }
}
