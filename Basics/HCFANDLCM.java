import java.util.Scanner;
class HCFANDLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int originalA=a;
        int originalB=b;
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println("HCF of "+originalA+" and "+originalB+" is "+a);
        int lcm=originalA*(originalB/a);
        System.out.println("LCM is "+lcm);
    }
}
