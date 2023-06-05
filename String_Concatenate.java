import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        s1=s1.concat(s2);
        char ch[]=s1.toCharArray();
        Arrays.sort(ch);
        s2=String.valueOf(ch);
        System.out.println(s2);
        sc.close();
    }
}
