import java.util.*;
public class Identimat {
   static Boolean idcheck(int n,int m,int arr1[][])
    {
        for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
          if((i==j) && arr1[i][j]!=1)
          {
           return false;
          }
          if((i!=j) && arr1[i][j]!=0)
          {
           return false;
          }
        }
    }
    return true;
    }

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
    if(idcheck(n, m, arr))
    {
        System.out.println("it is identity matrix");
    }
    else
    {
        System.out.println("it is not identity matrix");
    }
        
  }
}

