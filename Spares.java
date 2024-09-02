import java.util.*;
public class Spares {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row value:");
        int n=sc.nextInt();
        System.out.println("enter the column value:");
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        System.out.println("enter the array values:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]==0)
                {
                    count++;
                }
            }
        }
        if(count>((n+m)/2))
        {
            System.out.println("it is spares matrix");
        }
        else{
            System.out.println("it is not spares matrix");
        }
    }
}
