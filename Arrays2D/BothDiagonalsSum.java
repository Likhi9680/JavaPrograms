import java.util.Scanner;

public class BothDiagonalsSum {
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

        int mainSum = 0;
        int secondarySum = 0;
        for (int i = 0; i < m; i++) {
            mainSum += arr[i][i];
            secondarySum += arr[i][m - 1 - i];
        }

        System.out.println("Main diagonal sum: " + mainSum);
        System.out.println("Secondary diagonal sum: " + secondarySum);
        System.out.println("Combined sum: " + (mainSum + secondarySum));

        sc.close();
    }
}
