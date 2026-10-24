import java.util.Scanner;

class ColumnWiseSum2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int arr[][] = new int[m][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = 0; j < m; j++) {
                sum += arr[j][i];
                System.out.print(arr[j][i] + " ");
            }

            System.out.println();
            System.out.println("Sum of column " + i + ": " + sum);
        }
    }
}
