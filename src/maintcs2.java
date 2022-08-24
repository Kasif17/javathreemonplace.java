 import java.util.*;
public class maintcs2

{
    public static int sumOfDigits(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        if(r==0)
            System.out.println("0");
        else
        {
            int res=sumOfDigits(n)*r;
            int sum=0;
            while(true)
            {
                while(res>0)
                {
                    sum=sum+res%10;
                    res=res/10;
                }
                if((sum/10)==0)
                    break;
                else
                    res=sum;
            }
            System.out.println(sum);
        }
    } }
