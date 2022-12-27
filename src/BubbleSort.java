import java.util.*;

public class BubbleSort{
    public static void printArray(int a[])
    {
        System.out.print("Sorted Array=");
        for(int l = 0; l<a.length;l++)
        {
            System.out.print(a[l]+" ");
        }
    }
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number=");
        int n = sc.nextInt();

        System.out.print("Enter the numbers=");
        int i;
        int a[] = new int[n];
        for(i = 0; i<n;i++)
        {
            a[i] = sc.nextInt();
        }

        for(int j = 0; j<a.length-1; j++)
        {
            for(int k = 0; k<a.length-j-1; k++)
            {
                //swap
                if(a[k] > a[k+1])
                {
                    int temp = a[k];
                    a[k] = a[k+1];
                    a[k+1] = temp;
                }
            }
        }

        printArray(a);
    }
}