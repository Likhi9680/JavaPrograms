import java.util.Scanner;
class MinLenWordInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String arr[] = new String[n]; 
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLine();
        }
        String minlenword=arr[0];
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i].length()<minlenword.length()){
                minlenword=arr[i];
                index=i;
            }
        }
        System.out.println("Minimum length word in the string array is: "+minlenword+" and it's index is: "+index);
    }
}
