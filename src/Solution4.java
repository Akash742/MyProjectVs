import java.util.*;

public class Solution4 {
public static void main(String Args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the array length=");
    int n = sc.nextInt();
    int i;
    int a[] = new int [n];

    System.out.print("Enter the number=");
    for(i = 0; i<n; i++)
    {
        a[i] = sc.nextInt();

    }

    for(i = 0; i<n; i++)
    {
        if(a[i] % 2 == 0)
        {
            System.out.println("Even Number="+a[i]);
        }
        else
        {
            System.out.println("Odd Number="+a[i]);
        }
    }
}    
}
