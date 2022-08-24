import java.util.Scanner;

public class SecondP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      //  int j= sc.nextInt();
        int i=n , j,k ;
        if(n>=3){
        while(i>0){
            j=0;
            while(j++<n-1){
                System.out.print(" ");
            }
            j=0;
            while(j++<(i*2)-1){
                System.out.print(" *");
            }
            System.out.println();
            i--;

        }}
        else {
            while( i > 0)
            {
                k = 1 ;
                while(k <= n - i )
                {
                    System.out.print(" ");
                    k++;
                }
                k= 1 ;
                while(k <= (2 * i) - 1 )
                {
                    if(i == 1 || i == n || k == 1 || k == (2 * i) - 1)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                    k++;
                }
                System.out.println();
                i-- ;
            }
        }
    }
        }


