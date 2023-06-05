import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1[]=s.split(" ");
        char ch[]=new char[s1.length];
        for(int i=0;i<s1.length;i++)
        {
            ch[i]=s1[i].charAt(0);
        }
        int n=ch.length;
        for(int i=0;i<n/2;i++)
        {
            char temp=ch[i];
            ch[i]=ch[n-i-1];
            ch[n-i-1]=temp;
        }
        for(int i=0;i<n;i++)
          System.out.print(ch[i]+" ");
        sc.close();
    }
}