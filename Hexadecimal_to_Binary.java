import java.util.*;
 public class Sample
{
    
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      int t,temp;
      String hnum;
      t=sc.nextInt();
      sc.nextLine();
      while(t-->0)
      {
          hnum=sc.nextLine();
          hnum=hnum.toUpperCase();
          temp=Integer.parseInt(hnum,16);
          String s=Integer.toBinaryString(temp);
          if(s.length()%4==0)
            System.out.println(s);
          else
            {
                int k=s.length()%4;
                for(int i=0;i<4-k;i++)
                  System.out.print("0");
                 System.out.println(s);
            }
      }
      sc.close();
  }
}
