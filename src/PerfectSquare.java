import java.util.*;

public class PerfectSquare {
    static boolean isPerfectSquare(double n)
    {
        double sr = Math.sqrt(n);
        return ((sr - Math.floor(sr)) == 0);

    }
public static void main(String Args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number=");
    double n = sc.nextDouble();
    if(isPerfectSquare(n))
    {
        System.out.println("Perfect Square Number.");


    }
    else
    {
        System.out.println("Not a Perfect Square Number.");

    }
}    
}
