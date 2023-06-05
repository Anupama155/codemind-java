import java.util.Scanner;
 public class Solution 
{
     public static void reverse(int x[],int si,int ei)
     {
         while(si<ei)
         {
             int temp=x[si];
             x[si]=x[ei];
             x[ei]=temp;
             si++;
             ei--;
         }
     }
    public static void rotate(int[] nums, int k) {
        if(k==0 || k==nums.length || nums.length==1)
             return;
        k=k%nums.length;
        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-k-1);
        reverse(nums,0,nums.length-1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,n,k,x[],i;
        
        t=sc.nextInt();
        while(t-->0)
        {
            n=sc.nextInt();
            k=sc.nextInt();
            x=new int[n];
            for(i=0;i<n;i++)
               x[i]=sc.nextInt();
             rotate(x,k);
            for(i=0;i<n-1;i++)
              System.out.print(x[i]+" ");
            System.out.println(x[n-1]);
               
        }                                                    
    }
}