import java.util.Scanner;
class PrimeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        for(int i=start;i<=end;i++){
            if(i<2){
                continue;    //skips 0 and 1
            }
            boolean isPrime=true;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
