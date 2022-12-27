import java.util.*;

public class Solution
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number=");
        int n = sc.nextInt();
        int a[] = new int[n];
        int i, sum = 0;
        for(i = 0; i<n; i++)
        {
            a[i] = sc.nextInt();

        }

        for(i = 0; i<n; i++)
        {
            sum = sum + a[i];
        }

        for(i = 0; i<n; i++)
        {
            System.out.println(" "+a[i]);
        }

        System.out.println("Sum="+ sum);


        for(i = a.length-1; i>=0; i-- )
        {
            System.out.println(a[i]);
        }
    }
}