import java.util.*;
public class array2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int findArr[] = new int[n];
        //input loops
        for(int i =0 ; i<n; i++){
             findArr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        for(int i =0; i< n; i++){
            if(findArr[i]==x){
                System.out.println("number of index is "+i);
            }
            else{
                System.out.println("not find ");

            }
        }
    }
}
