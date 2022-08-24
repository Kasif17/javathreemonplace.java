import java.io.*;
import java.util.Scanner;

public class KasifFirstpatter {
    public static void PrintPattern1(int n){
        for ( int i=0; i<n; i++){
            for (int j=n-1; j>1; j--){
                System.out.println("");
            }
            for (int j = 0 ; j<=i;j++);{
                System.out.println("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        PrintPattern1(n);

    }
}
