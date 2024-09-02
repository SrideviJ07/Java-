import java.util.*;
public class Twodarr {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row value:");
        int n=sc.nextInt();
        System.out.println("enter the column value:");
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
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
                //System.out.print(arr[i][j]);
                if (i>j) {
                    arr[i][j]=0;
                }
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }

    }
}
