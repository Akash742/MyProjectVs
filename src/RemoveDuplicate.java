public class RemoveDuplicate{
    public static boolean map[] = new boolean [26];
    public static void removeDuplicate(String str, int idx, String newStr)
    {
        if(idx == str.length())
        {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true)
        {
            removeDuplicate(str, idx+1, newStr);
        }
        else
        {
            newStr += currChar;
            map[currChar-'a'] = true;
            removeDuplicate(str, idx+1, newStr);
        }
    }
    public static void main(String Args[])
    {
        String str = "aabbccddefaakk";
        removeDuplicate(str, 0, "");
    }
}