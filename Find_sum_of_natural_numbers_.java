import java.util.Scanner;
public class natural 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,s;
        n=sc.nextInt();
        s=n*(n+1)/2;
        System.out.println(s);
    }
}