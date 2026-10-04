import java.util.Scanner;

class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Quotient = " + (a / b));
        System.out.println("Remainder = " + (a % b));
    }
}
