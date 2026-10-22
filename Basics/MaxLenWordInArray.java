import java.util.Scanner;
class MaxLenWordInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String arr[] = new String[n]; 
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLine();
        }
        String maxlenword=arr[0];
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i].length() > maxlenword.length()){
                maxlenword=arr[i];
                index=i;
            }
        }
        System.out.println("Maximum length word in the string array is: "+maxlenword+" and it's index is: "+index);
    }
}
