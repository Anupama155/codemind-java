import java.util.*;
public class average
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float avg;
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        avg=(float)(a+b)/2;
        System.out.format("%.4f",avg);
        sc.close();
    }
}