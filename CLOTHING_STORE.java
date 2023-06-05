import java.util.Scanner;
public class ArraysDemo
{
  public static int findPairs(int arr[],int size)
  {
     int count=0,pairs=0;
	 for(int i=0;i<size;i++)
	 {
	    if(arr[i]!=-1)
		{
		    count=1;
		   for(int j=i+1;j<size;j++)
		   {
		     if(arr[i]==arr[j])
			   { count++;
			      arr[j]=-1;
			   }
		   } 
		   pairs=pairs+count/2;
		}
		
	 }
	 return pairs;
  }
 public static void main(String args[])
 {
     Scanner sc=new Scanner(System.in);
     int n,x[],i;
     n=sc.nextInt();
     x=new int[n];
     for(i=0;i<n;i++)
      x[i]=sc.nextInt();
       
     System.out.println(findPairs(x,n));	 
 }
}