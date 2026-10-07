import java.util.Scanner;
class Fibonacci{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number fibonacci series you want to print: ");
    int num=sc.nextInt();
    int a=0;
    int b=1;
    System.out.println("The "+num+" "+"fibonacci series are: ");
    for(int i=0;i<num;i++){
      System.out.print(a+" ");
      int c= a+b;
      a=b;
      b=c;
    }
  }
}
