import java.util.*;
public class BinarySearch {
   static int binarysearch(int arr[],int t)
    {
        int l=0;
        int r=arr.length-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if (arr[mid]==t)
            {
                return mid;
            }
            else if(arr[mid]<t)
            {
                l=mid+1;
            }
            else
            {
               r=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        //int arr[]={1,2,3,4,5,6,7,8,9};
        int i,arr[]=new int[args.length];
        for(i=0;i<args.length;i++)
        {
            arr[i]=Integer.parseInt(args[i]);
        }
        System.out.println(" ");
        int target=sc.nextInt();
        int result=binarysearch(arr,target);
        System.out.println("the value is found at index "+result);
        
    }
}
