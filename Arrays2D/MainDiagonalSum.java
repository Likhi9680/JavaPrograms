import java.util.Scanner;

public class MainDiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter order of square matrix: ");
        int m = sc.nextInt();
        int[][] arr = new int[m][m];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += arr[i][i];
        }

        System.out.println("Main diagonal sum: " + sum);

        sc.close();
    }
}
