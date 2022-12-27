import java.util.*;

public class PalindromeNumber {
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number= ");
        int num = sc.nextInt();

        int temp = num;

        int reminder, reverse_num = 0;

        while(temp != 0)
        {
            reminder = temp % 10;
            reverse_num = reverse_num * 10 + reminder;
            temp = temp / 10;
        }

        if(reverse_num == num)
        {
            System.out.println("Palindrome Number.");
        }
        else
        {
            System.out.println("Not Palindrome Number.");
        }
    }
}
