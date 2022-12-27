public class PermutationOfString {
    public static void printPermutation(String str, String permutation)
    {
        if(str.length() == 0)
        {
            System.out.println(permutation);
        }
        for(int i  = 0; i<str.length(); i++)
        {
            char currChar = str.charAt(i);
            //"abc"-->"bc"
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPermutation(newStr, permutation + currChar);
        }
    }
 public static void main(String Args[])
 {
     String str = "abc";
     printPermutation(str, "");
 }   
}
