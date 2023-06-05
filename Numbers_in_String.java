import java.util.*;
public class Sample
{
    public static int findSum(String s)
    {
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isDigit(ch))
               sum=sum+(ch-'0');
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(findSum(s));
        sc.close();
    }
}
