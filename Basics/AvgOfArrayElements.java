import java.util.Scanner;
class AvgOfArrayElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=arr.length;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        double avg=sum/count;
        System.out.println("The average of elements in an array is: "+avg);
    }
}
