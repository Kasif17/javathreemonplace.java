import javax.swing.*;
import java.util.*;
//import java.util.Scanner;

public class ArraytwoD{
    public static void PrintPattern1(int n){
        //if(n>=3){
        for ( int i=0; i<n; i++){
            for (int j=n-i; j>1; j--){
                System.out.print(" ");
            }
            for (int j = 0 ; j<=5; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
     //  int m = 5;
       Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
      //  int n= 5;
        PrintPattern1(n);

    }
}