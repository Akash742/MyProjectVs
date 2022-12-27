import java.util.*;

public class Solution1 {
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string=");
        String str = sc.nextLine();
        System.out.print("Enter the second String=");
        String str1 = sc.nextLine();

        String str2 = str.concat(str1);
        System.out.println(str2);
        System.out.println(str.toLowerCase());
        System.out.println(str2.toUpperCase());
        System.out.println(str2.indexOf("y"));
        System.out.println(str2.replace("Akash","Rahul"));
        String[] str3 = str2.split("D");

        for(String a:str3)
        {
            System.out.println(a);
        }


        //char [] str4 = str2.toCharArray();

        for(int i = str2.length()-1; i>=0; i--)
        {
            System.out.print(str2.charAt(i));       //System.out.print(str4[i]);

        }
        System.out.println();

        int i = 0;
        for(char c: str.toCharArray()){
            i++;

        }
        System.out.println("String Length="+i);
    }
}
