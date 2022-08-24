import java.util.Scanner;

public class tcspq1 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i= 0 ; i<=n ; i++){
            arr[i]= sc.nextInt();
        }
        int count =  0;
        int t=0;
        for ( int i =0 ; i<n-m; i++){
            if ( arr[i]==arr[n-m]){
                t++;
                if (t==m){
                    t=0;
                    count++;
                    if ( count == k){
                        System.out.println("yes");
                    }
                    
                }
            }
            else {
                t=0;
                count=1;
            }
        }
        System.out.println("no");
    }
}
