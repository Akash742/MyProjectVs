import java.util.HashSet;

public class Practice {
    public static void subSequences(String str, int idx, String newStr, HashSet<String> set)
    {
        if(idx == str.length())
        {
            if(set.contains(newStr))
            {
                return;
            }
            else
            {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char currChar = str.charAt(idx);
        //To Be
        subSequences(str, idx+1, newStr+currChar, set);
        //Not To Be
        subSequences(str, idx+1,  newStr, set);
    }
   public static void main(String Args[])
   {
       HashSet<String> set = new HashSet<>();
       String str = "xxx";
       subSequences(str, 0, "", set);
   }
}
