import java.util.Scanner;
import java.util.Arrays;
class MergeStringArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        sc.nextLine();
        String arr1[]=new String[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextLine();
        }
        int n2=sc.nextInt();
        sc.nextLine();
        String arr2[]=new String[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextLine();
        }
        String merged[]=new String[n1+n2];
        for(int i=0;i<n1;i++){
            merged[i]=arr1[i];
        } 
        for(int i=0;i<n2;i++){
            merged[n1+i]=arr2[i];
        }
        System.out.println(Arrays.toString(merged));
    }
}
