import java.util.Arrays;
import java.util.Scanner;

public class CelebEff {

    static void celebfind(int arr[][])
    {
        int n=arr.length,j=0;
        for(int i=0;i<n;i++)
         {
            int arr1[]=arr[i];
            if(Arrays.equals(arr1,new int[n]))
            {
                for(j=0;j<n;j++)
                {
                    if(i==j)
                    continue;
                   else if (arr[j][i]==0)
                    {
                    System.out.println("there is no celeb");
                   } 
                    
                }
            }
        }
        System.out.println("there is celeb ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size:");
        int size=sc.nextInt();
        int arr[][]=new int[size][size];
        for(int i=0;i<size;i++)
        {
            for (int j=0;j<size;j++)
            {
                
            System.out.printf("enter the value of arr[%d][%d]",i,j);
                arr[i][j]=sc.nextInt();
            }
            
        }
        System.out.println("The array is:");
        for(int i=0;i<size;i++)
        {
            for (int j=0;j<size;j++)
            {
                
            System.out.print(arr[i][j]+" ");
                
            }
            System.out.println("");
            
        }
        celebfind(arr);
    }
}
