import java.util.*;
public class Largearr {
    static boolean prime1(int n)
    {
       if(n<2)
       {
        return false;
       }
       for(int i=2;i<=n/2;i++)
       {
        if(n%i==0)
        {
            return false;
        }
       }
      return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("enter the kth value:");
        int k=sc.nextInt();
        System.out.println("the kth greatest num is:");
        int k1=arr[n-k];
        System.out.println(k1);
        //int s=prime1(k1);
        if(prime1(k1)==true)
        {
            System.out.println("it is prime num");
        }
        else{
            System.out.println("it is not prime num");
        }
        
        



        //System.out.println(Arrays.toString(arr));
    }
}
