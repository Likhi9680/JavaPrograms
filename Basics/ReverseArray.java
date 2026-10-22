import java.util.Scanner;
import java.util.Arrays;
class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String arr[] = new String[n]; 
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLine();
        }
        String rev[]=new String[n];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            rev[j]=arr[i];
            j++;
        }
        System.out.println(Arrays.toString(rev));
        
    }
}
