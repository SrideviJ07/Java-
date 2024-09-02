import java.util.*;
public class Oddarr {
    static int[] oddarray(int s)
    {
        int arr[]=new int[s/2], c=0;
        for(int i=0;i<s;i++)
        {
        if(i%2==1)
        {
            arr[c++]=i; 
        }
        
        }
        return arr;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(Arrays.toString(oddarray(a)));
    }
}
