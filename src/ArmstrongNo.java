import java.util.*;

public class ArmstrongNo {
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number=");
        int num = sc.nextInt();
        int n = num;
        int a, s = 0;
    
        while(num>0)
        {
            a = num % 10;
            s = s + a*a*a;
            num =num / 10;
    
        }
    
        if(n == s)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not Armstrong Number");
        }
    }    
}
