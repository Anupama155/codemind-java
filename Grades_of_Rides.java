import java.util.*;
 public class Sample
{
    public static void main(String args[])
    {
        int h,s,sp, grade  = 0;
        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();
        s = sc.nextInt();
        sp = sc.nextInt();
        if(h>50 && s>60 && sp>100)
        grade = 10;
        else if(h>50 && s>60)
        grade = 9;
        else if(s>60 && sp>100)
        grade = 8;
        else if(h>50 && sp>100)
        grade = 7;
        else if(h>50 || s>60 || sp>100)
        grade = 6;
        else grade = 5;
        System.out.println(grade);
        sc.close();
    }
}