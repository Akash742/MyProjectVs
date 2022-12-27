import java.util.*;

public class Practice1{
   public static void main(String args[]){

       Scanner sc=new Scanner(System.in);

       int a,b,c;

       System.out.print("Enter length of largest side: ");

       a=sc.nextInt();

       System.out.print("Enter length of base: ");

       b=sc.nextInt();

       System.out.print("Enter length of height: ");

       c=sc.nextInt();

       if(a * a == b * b + c * c)

           System.out.println("Right Triangle");

       else

           System.out.println("Not Right Triangle");

   }

}


