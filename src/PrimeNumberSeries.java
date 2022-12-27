import java.util.*;

public class PrimeNumberSeries {
    static boolean isPrime(int n)
    {
        if(n == 0 || n == 1)
        {
            return false;
        }

        for(int i = 2; i<n; i++ )
        {
            if(n % i == 0)
            {
                return false;
            }

        }
        return true;
    }
public static void main(String Args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number=");
    int n = sc.nextInt();
   // System.out.print(isPrime(n));

    for(int i = 1; i<=n; i++)
    {
        if(isPrime(i))
        {
            System.out.print(" "+i);
        }
    }
}    
}
