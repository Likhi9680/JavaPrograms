import java.util.Scanner;

public class IdenticalMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows of first matrix: ");
        int m1 = sc.nextInt();
        System.out.print("Enter columns of first matrix: ");
        int n1 = sc.nextInt();
        int[][] arr1 = new int[m1][n1];

        System.out.println("Enter first matrix:");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter rows of second matrix: ");
        int m2 = sc.nextInt();
        System.out.print("Enter columns of second matrix: ");
        int n2 = sc.nextInt();
        int[][] arr2 = new int[m2][n2];

        System.out.println("Enter second matrix:");
        for (int i = 0; i < m2; i++) {
            for (int j = 0; j < n2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        boolean identical = m1 == m2 && n1 == n2;

        if (identical) {
            for (int i = 0; i < m1 && identical; i++) {
                for (int j = 0; j < n1; j++) {
                    if (arr1[i][j] != arr2[i][j]) {
                        identical = false;
                        break;
                    }
                }
            }
        }

        System.out.println(identical
                ? "Matrices are identical"
                : "Matrices are not identical");

        sc.close();
    }
}
