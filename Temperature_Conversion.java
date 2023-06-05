import java.util.Scanner;
public class Sample
{
    public static void main(String args[])
    {
        int c;
        float f;
        Scanner sc=new Scanner(System.in);
        c=sc.nextInt();
        f=32+(c*(float)9/5);
        System.out.format("%.2f",f);
        sc.close();
    }
}