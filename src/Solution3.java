import java.util.*;

public class Solution3
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number=");
        int n = sc.nextInt();
        int a , s = 0;

        for(a = 1; a<n; a++)
        {
            if(n%a == 0)
            {
                s = s + a;

            }
        }

        if(n == s)
        {
            System.out.println("Perfect Number");

        }
        else
        {
            System.out.println("Not Perfect Number");
        }
    }
}