import java.util.*;

public class primeNumber{
    static void checkPrime(int n)
    {
        int i, m = 0, flag = 0;

        m = n/2;

        if(n == 0 || n == 1)
        {
            System.out.println("Non-Prime Number");
        }
        else
        {
            for(i = 2; i<=m; i++)
            {
                if(n % i == 0)
                {
                    System.out.println("Non-Prime Number");
                    flag = 1;
                    break;
                }
            }
        }
        if(flag == 0)
        {
            System.out.println("Prime Number");
        }
    }
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number= ");
        int n = sc.nextInt();

        checkPrime(n);
    }
}