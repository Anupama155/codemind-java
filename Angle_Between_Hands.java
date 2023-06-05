import java.util.Scanner;
public class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String val[]=s.split(":");
        int h,m;
        float a;
        h=Integer.parseInt(val[0]);
        m=Integer.parseInt(val[1]);
        a=30*h-((float)11/2)*m;
        a=Math.abs(a);
        if(a>180)
            System.out.println(360-a);
        else
           System.out.println(a);
        sc.close();
    }
}