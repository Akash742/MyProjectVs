import java.util.Scanner;

public class Solution2{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number=");
        int num = sc.nextInt();
        int n = num;
        int rev = 0, rem;

        while(n!=0)
        {
            rem = n % 10;
            rev = rev*10 + rem;
            n = n/10;
        }

        if(num == rev)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}
