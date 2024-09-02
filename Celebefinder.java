import java.util.Scanner;

class Celeb{
    
    public int celebrityfinder(int arr[][])
    {
        int i,j,n=arr.length,knows[]=new int[n],knownby[]=new int[n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(arr[i][j]==0)
                {
                    knows[i]++;
                    knownby[j]++;
                }
            }
        }
    }
    
}






public class Celebefinder {
    public static void main(String[] args) {
        //int size;
        
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


    }
}
