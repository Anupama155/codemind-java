import java.util.*;
public class Sample
{
    public static String lowerCase(String s)
    {
       String result="";
       for(int i=0;i<s.length();i++)
       {
           char c=s.charAt(i);
           if(c>=65 && c<=90)
             result=result+(char)(c+32);
           else
             result=result+c;
       }
       return result;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(lowerCase(s));
        sc.close();
    }
}