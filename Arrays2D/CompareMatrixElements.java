import java.util.Scanner;

public class CompareMatrixElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int m = sc.nextInt();
        System.out.print("Enter columns: ");
        int n = sc.nextInt();

        int[][] arr1 = new int[m][n];
        int[][] arr2 = new int[m][n];

        System.out.println("Enter first matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter second matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Comparison matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr1[i][j] == arr2[i][j] ? "1 " : "0 ");
            }
            System.out.println();
        }

        sc.close();
    }
}
