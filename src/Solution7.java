import java.util.*;

public class Solution7{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ar[] = new int[n];

        for(int i = 0; i<n; i++)
        {
            ar[i] = sc.nextInt();
        }

        int start = 0, end = 0;
        start = sc.nextInt();
        end = sc.nextInt();

        for(int i = 0; i<start; i++)
        {
            System.out.print(ar[i]+" ");
        }

        for(int i = end; i>=start; i--)
        {
            System.out.print(ar[i]+" ");
        }
    }
}