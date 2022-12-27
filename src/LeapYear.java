import java.util.*;

public class LeapYear {
public static void main(String Args[]){
    Scanner sc = new Scanner(System.in);
    int year = 0;
    try
    {
        System.out.print("Enter the Year=");
        year = sc.nextInt();
    }
    catch(NumberFormatException nfe)
    {
        System.out.print("Only Integer is Permitted.");

    }
    finally{
        if((year%4==0 && year%100 != 0) || (year % 400 == 0)){
            System.out.print("Leap Year.");
        }
        else
        {
            System.out.print("Not Leap Year");
        }
    }
}
}
