import java.util.Scanner;
 public class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,s,b,C;
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        C=2*t*s*b*512;
        System.out.println(C);
        sc.close();
    }
}
