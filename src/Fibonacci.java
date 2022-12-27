import java.util.*;

public class Fibonacci {
  static void printFibonacciNumbers(int num)
    {
      if(num < 1)
      {
       return;
      }
      int f1 = 0, f2 = 1, i;

      for(i = 1; i<=num; i++)
      {
        System.out.print(" "+ f2);
        int next = f1 + f2;
        f1 = f2;
        f2 = next;
      }
    }
public static void main(String Args[])
{
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the limit=");
   int num = sc.nextInt();
   printFibonacciNumbers(num);
}
}