import java.util.*;
public class Sample
{
    public static int countEvens(int arr[])
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            int d=(int)Math.log10(arr[i])+1;
            if(d%2==0)
              count++;
        }
        return count;
    }
    public static void main(String args[])
    {
        int n,arr[];
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
         arr[i]=sc.nextInt();
        System.out.println(countEvens(arr));
        sc.close();
    }
}
