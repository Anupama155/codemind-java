import java.util.Scanner;
 public class Sample
{
    public static void main(String args[])
    {
        int a;
        String Sound = "";
        Scanner sc= new Scanner(System.in);
        a = sc.nextInt();
        if(a%3 == 0)
        Sound = Sound+"Pling";
        if(a%5== 0)
        Sound = Sound+"Plang";
        if(a%7 == 0)
        Sound+="Plong";
        if(Sound.isEmpty())
        System.out.println(a);
        else 
        System.out.println(Sound);
        sc.close();
    }
    
}