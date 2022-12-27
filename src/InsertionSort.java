import java.util.*;

public class InsertionSort {
    public static void printArray(int a[])
    {
        for(int l =0; l<a.length; l++)
        {
            System.out.print(a[l]+" ");
        }
    }
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i =0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }

        for(int j =1; j<a.length; j++)
        {
            int current = a[j];
            int k = j-1;
            while(k>=0 && current < a[k])
            {
                a[k+1] = a[k];
                k--;

            }

            //placement
            a[k+1] = current;
        }
        printArray(a);
    }
}
