import java.util.*;
public class Sample
{
    public static char maxValuedChar(String s)
    {
        char max_char=s.charAt(0);
        for(int i=1;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>max_char)
               max_char=ch;
        }
        return max_char;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(maxValuedChar(s));
        sc.close();
    }
}