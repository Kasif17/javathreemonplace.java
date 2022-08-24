import java.util.*;
public class array1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int marks[]= new int[n];
        for(int i = 0 ; i<n; i++){
            marks [i] = sc.nextInt();
        }
    //    int marks[]= new int[n];
     /*   marks [0]= 91;
        marks [1]= 91;
        marks [2]= 91;
        marks [3]= 91;
        marks [4]= 91; */
        for(int i = 0; i <n; i++ ){
            System.out.println(marks[i]);
        }


    }
}
