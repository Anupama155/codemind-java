import java.util.Scanner;
 public class ThreeDivisors
{
    public static boolean isPrime(int n)
    {
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
              return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,count=0;
        m=sc.nextInt();
        for(int i=2;i<=(int)Math.sqrt(m);i++)
        {
              if(isPrime(i))
                 count++;
        }
        System.out.println(count);
        sc.close();
    }    
}