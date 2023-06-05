import java.util.Scanner;
 public class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float pi=3.14f,area;
        int r;
        r=sc.nextInt();
        area=pi*r*r;
        System.out.format("%.2f",area);
        sc.close();
    }
}
