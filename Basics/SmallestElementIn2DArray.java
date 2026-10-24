import java.util.Scanner;

class SmallestElementIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter No.of rows: ");
        int m = sc.nextInt();

        System.out.print("Enter No.of columns: ");
        int n = sc.nextInt();

        int arr[][] = new int[m][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int minelement = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");

                if (arr[i][j] < minelement) {
                    minelement = arr[i][j];
                }
            }
            System.out.println();
        }

        System.out.println("Smallest element: " + minelement);
    }
}
