import java.util.Scanner;

class DifferenceOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int difference = a - b;

        System.out.println("Difference = " + difference);
    }
}
