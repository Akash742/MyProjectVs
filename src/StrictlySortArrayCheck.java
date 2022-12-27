import java.util.*;

public class StrictlySortArrayCheck {
    public static boolean checkStrictlySortedArray(int ar[], int n)
    {
        if(n == ar.length-1)
        {
            return true;
        }

        if(ar[n]<ar[n+1])
        {
            return checkStrictlySortedArray(ar, n+1);
        }
        else
        {
            return false;
        }
    }
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Length=");
        int n = sc.nextInt();
        int ar[] = new int[n];
        for(int i = 0; i<n; i++)
        {
            System.out.print("Enter the number=");
            ar[i] = sc.nextInt();
        }

        int x = 0;
        System.out.println(checkStrictlySortedArray(ar, x));
    }
}
